import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Converter {
    public static void main(String[] args) {

        BufferedReader newBuffer = null;

        try {
            String newLine;                                         //whole line from csv
            newBuffer = new BufferedReader(new FileReader("/Users/carlacatherine/Downloads/dsa/src/dc-wikia-data.csv"));


            while ((newLine = newBuffer.readLine()) != null) {
                // System.out.println("Raw CSV : " + newLine);      //show raw csv
                Converter(newLine);                                 //converted the new line with Converter
                System.out.println("\n");


            }
        } catch (IOException e) {                                   //try catch for IO exception
            e.printStackTrace();
        } finally {
            try {
                if (newBuffer != null) newBuffer.close();
            } catch (IOException newException) {
                newException.printStackTrace();
            }
        }
    }


    public static void Converter(String newCSV) {                   //convert csv using split
        LinkedList llist = new LinkedList();                        //new LINKED LIST
        Stack stackie = new Stack();                                //new STACK
        Queue q = new Queue();                                      //new QUEUE
        DLL dll = new DLL();                                        //new DOUBLY LINKED LIST


        if (newCSV != null) {
            String[] splitData = newCSV.split("\\s*,\\s*");   //split on comma
            for (int i = 0; i < splitData.length; i++) {
                if (!(splitData[i] == null) || !(splitData[i].length() == 0) || splitData[i].isEmpty()) {
                    llist.append(splitData[i].trim());              //add to linked list
                    dll.append(splitData[i].trim());                //add to doubly linked list
                    stackie.push(splitData[i].trim());              //add to stack
                    q.enqueue(splitData[i].trim());                 //add to queue
                }
            }
        }
        System.out.println("Doubly linked list");
        dll.printlist(dll.head);                                    //printing
        System.out.println("\n");
        System.out.println("Linked List:");
        llist.printList();

        System.out.println("\n Stack:");
        for (int i = 0; i < 12; i++) {                              //loop through each one to print
            System.out.println(stackie.pop());

        }


        System.out.println("\n Queue:");
        for (int i = 0; i < 12; i++) {                              //loop through each one to print
            try {
                System.out.println(q.dequeue().key);
            }
            catch (NullPointerException d) {                        // to get rid of any NPE's

            }
        }
    }
}