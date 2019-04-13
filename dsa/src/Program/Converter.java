package Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Converter {
    private static ArrayList<DcChar> charac;
    private static LinkedList<DcChar> listy;
    public static DcChar[] array = new DcChar[6897];
    private static int length;
    public static void Converter() throws Exception {

        BufferedReader newBuffer = null;

        try {
            String newLine;                                         //whole line from csv
            newBuffer = new BufferedReader(new FileReader("/Users/carlacatherine/Downloads/dsa/src/Program/dc-wikia-data.csv"));

            while ((newLine = newBuffer.readLine()) != null) {
                Converter1(newLine);                                 //converted the new line with Converter
                length++;
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
        //printArray();
    }


    public static void Converter1(String newCSV) throws Exception  {                   //convert csv using split


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
                character.setFAppearance(splitData[11].trim());
            } if(max > 12) {
                character.setYear(splitData[12].trim());
            }


            array[length] = character;


        }


    }

    public static void printArray(){
        InsertionSortAlgo t = new InsertionSortAlgo();
        for(int i=0; i< array.length; i++){
            try {if(array[i].getName().isEmpty()){ System.out.println("er is een null");}}
            catch (NullPointerException e){System.out.println(i);}
            //System.out.println("current element"+ i + " is: " + array[i].getName());
        }


        t.insSort(array);
        // t.smartBubble(array);

        for(int i=0; i < array.length; i++){
            System.out.println("current element is: " + array[i].getName());
        }
    }

    public static DcChar[] returnArray(){
        return array;
    }

}
