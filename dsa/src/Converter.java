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
            newBuffer = new BufferedReader(new FileReader("C:\\Users\\ramon\\Documents\\AlgorithmsComic\\dsa\\src\\dc-wikia-data.csv"));


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
        DoublyLL dll = new DoublyLL();                                        //new DOUBLY LINKED LIST
        BinaryST bst = new BinaryST();
        charac = new ArrayList<>();


        if (newCSV != null) {
            String[] splitData = newCSV.split("\\s*,\\s*");   //split on comma
            DcChar character = new DcChar();
            int max = splitData.length;
            character.setName(splitData[1].trim());
            character.setId(splitData[3].trim());
            character.setAlign(splitData[4].trim());
            character.setEye(splitData[5].trim());
            character.setHair(splitData[6].trim());
            if(max >= 7){
                character.setSex(splitData[7].trim());
            } if(max > 8) {
                character.setGSM(splitData[8].trim());
            } if(max > 9) {
                character.setAlive(splitData[9].trim());
            } if(max > 10) {
                character.setappearance(splitData[10].trim());
            } if(max > 11) {
                System.out.println(max);
                character.setFAppearance(splitData[11].trim());
            } if(max > 12) {
                character.setYear(splitData[12].trim());
            }

            listy.append(character);
            stackie.push(character);
            q.enqueue(character);
            System.out.println(stackie.pop());
            /*
            for (int i = 0; i < splitData.length; i++) {

                if (!(splitData[i] == null) || !(splitData[i].length() == 0) || splitData[i].isEmpty()) {
                    System.out.println(splitData[i]);



                    System.out.println(character.getName());

                    q.enqueue(character.getName());
                    llist.append(splitData[i].trim());              //add to linked list
                    dll.append(splitData[i].trim());                //add to doubly linked list
                    stackie.prepend(splitData[i].trim());              //add to stack
                    q.enqueue(splitData[i].trim());                 //add to queue
                    bst.insert(splitData[i].trim());                   //add to binary search tree
                }
            }
        }
        /*System.out.println("LList: ");
        for (DcChar chara : charac){
            System.out.println(chara.getName());
        }
        llist.printList();
        listy.printList();
        System.out.println();
        System.out.println("DoublyLL:");
        dll.printlist(dll.head);

        System.out.println("\n Stack:");
        for (int i = 0; i < 12; i++) {                              //loop through each one to print
            try {
                System.out.println(stackie.pop());
                var test = stackie.pop();
                System.out.println(test.getClass());
            } catch(NullPointerException n) {

            }
        }

        System.out.println("\n Queue:");
        for (int i = 0; i < 12; i++) {                              //loop through each one to print
            try {
                System.out.println(q.dequeue().key);

            }
            catch (NullPointerException d) {                        // to get rid of any NPE's

            }
        }
        System.out.println("BinaryST:");
        bst.preOrder();

        }*/



    }
    }}
