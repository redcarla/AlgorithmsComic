import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Converter {
    public static void main(String[] args) {

        BufferedReader newBuffer = null;

        try {
            String newLine; //whole line
            newBuffer = new BufferedReader(new FileReader("C:\\Users\\ramon\\Documents\\GitHub\\AlgorithmsComic\\AlgorithmsComic\\dsa\\src\\dc-wikia-data.csv"));


            while ((newLine = newBuffer.readLine()) != null) {
        //        System.out.println("Raw CSV data: " + newLine); //whole line
                Converter(newLine);//converted to arraylist by Converter metho
                System.out.println("\n");


            }
        } catch (IOException e) {
            e.printStackTrace(); //catches IO exception
        } finally {
            try {
                if (newBuffer != null) newBuffer.close();
            } catch (IOException newException) {
                newException.printStackTrace();
            }
        }
    }

    // Utility which converts CSV to ArrayList using Split Operation
    public static LinkedList Converter(String newCSV) {
        LinkedList llist = new LinkedList();
        Stack stackie = new Stack();
        ArrayList<String> newResult = new ArrayList<String>();
        Queue q = new Queue();

            if (newCSV != null) {
                String[] splitData = newCSV.split("\\s*,\\s*");
                for (int i = 0; i < splitData.length; i++) {
                    if (!(splitData[i] == null) || !(splitData[i].length() == 0) || splitData[i].isEmpty()) {
                        //newResult.add(splitData[i].trim());
                        //llist.append(splitData[i].trim());
                        //stackie.push(splitData[i].trim());
                        q.enqueue(splitData[i].trim());
                    }
                }
            }
    //llist.printList();
            for(int i=0; i < 12; i++) {
                try {
                    System.out.println(stackie.pop());
                    //System.out.println(q.dequeue().key);
                }
                // to get rid of any NPE's
                catch(NullPointerException d){

                }

            }
        return llist;
            //TODO: create function to get individual elements of arraylist
    }

    }






