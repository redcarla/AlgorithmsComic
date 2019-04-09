import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Converter {
    public static void main(String[] args) {

        BufferedReader newBuffer = null;

        try {
            String newLine; //whole line
            newBuffer = new BufferedReader(new FileReader("/Users/carlacatherine/Downloads/dsa/src/dc-wikia-data.csv"));


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
        ArrayList<String> newResult = new ArrayList<String>();

            if (newCSV != null) {
                String[] splitData = newCSV.split("\\s*,\\s*");
                for (int i = 0; i < splitData.length; i++) {
                    if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
                        newResult.add(splitData[i].trim());
                        llist.append(splitData[i].trim());
                    }
                }
            }
    llist.printList();
        return llist;

            //TODO: create function to get individual elements of arraylist
    }

    }






