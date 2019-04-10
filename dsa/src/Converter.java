import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Converter {
    private static ArrayList<DcChar> charac;
    private static LinkedList<DcChar> listy;
    public static void main(String[] args) {

        BufferedReader newBuffer = null;

        try {
            String newLine;                                         //whole line from csv
            newBuffer = new BufferedReader(new FileReader("C:\\Users\\ramon\\Documents\\GitHub\\AlgorithmsComic\\AlgorithmsComic\\dsa\\src\\dc-wikia-data.csv"));


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
        listy = new LinkedList<>();                        //new LINKED LIST
        Stack stackie = new Stack();                                //new STACK
        Queue q = new Queue();                                      //new QUEUE
        DLL dll = new DLL();                                        //new DOUBLY LINKED LIST
        BinaryST bst = new BinaryST();
        charac = new ArrayList<>();


        if (newCSV != null) {
            String[] splitData = newCSV.split("\\s*,\\s*");   //split on comma
            for (int i = 0; i < splitData.length; i++) {
                if (!(splitData[i] == null) || !(splitData[i].length() == 0) || splitData[i].isEmpty()) {
                    //System.out.println(splitData[i]);

                    if(i ==2) {
                        DcChar character = new DcChar();
                        character.setName(splitData[1]);
                        charac.add(character);

                        listy.append(character);
                    }


                    /*//System.out.println(character.getName());

                    //q.enqueue(character.getName());
                    llist.append(splitData[i].trim());              //add to linked list
                    dll.append(splitData[i].trim());                //add to doubly linked list
                    stackie.push(splitData[i].trim());              //add to stack
                    q.enqueue(splitData[i].trim());                 //add to queue
                    bst.insert(splitData[i].trim());    */               //add to binary search tree
                }
            }
        }
        //System.out.println("LList: ");
        for (DcChar chara : charac){
            System.out.println(chara.getName());
        }
          //  llist.printList();
        listy.printList();
        //System.out.println();
        //System.out.println("DLL:");
          //  dll.printlist(dll.head);

        /*System.out.println("\n Stack:");
        for (int i = 0; i < 12; i++) {                              //loop through each one to print
            try {
                System.out.println(stackie.pop());
                var test = stackie.pop();
                System.out.println(test.getClass());
            } catch(NullPointerException n) {

            }
        }
/*

        System.out.println("\n Queue:");
        for (int i = 0; i < 12; i++) {                              //loop through each one to print
            try {
                System.out.println(q.dequeue().key);

            }
            catch (NullPointerException d) {                        // to get rid of any NPE's

            }
        } /*
        System.out.println("BinaryST:");
        bst.preOrder();
*/
        }


    }
