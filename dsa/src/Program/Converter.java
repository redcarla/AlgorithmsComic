package Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Converter {
    public static DcChar[] array;

    private static int length;
    public static void Converter(String type) throws Exception {
        String fileName = "";
        type = type.toUpperCase();
        if (type.equals("MARVEL")){
            array = new DcChar[16377];
            fileName = "C:\\Users\\ramon\\Documents\\dsaa\\dsa\\src\\Program\\marvel-wikia-data.csv";
        } else if (type.equals("DC")){
            array = new DcChar[6897];
            fileName = "C:\\Users\\ramon\\Documents\\dsaa\\dsa\\src\\Program\\dc-wikia-data.csv";
        }

        BufferedReader newBuffer = null;

        try {
            String newLine;                                         //whole line from csv
            newBuffer = new BufferedReader(new FileReader(fileName));

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
            if(max >= 1) {
                character.setName(splitData[1].trim());
            }
            if(max < 3) {
                character.setId(splitData[3].trim());
            }
            if(max >= 4) {
                character.setAlign(splitData[4].trim());
            }
            if(max >= 5) {
                character.setEye(splitData[5].trim());
            }
            if(max >= 6) {
                character.setHair(splitData[6].trim());
            }
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
        //InsertionSortAlgo t = new InsertionSortAlgo();
        for(int i=0; i< array.length; i++){
            try {if(array[i].getName().isEmpty()){ System.out.println("er is een null");}}
            catch (NullPointerException e){System.out.println(i);}
            //System.out.println("current element"+ i + " is: " + array[i].getName());
        }


        //t.insSort(array);
        // t.smartBubble(array);

        for(int i=0; i < array.length; i++){
            System.out.println("current element is: " + array[i].getName());
        }
    }

    public static DcChar[] returnArray(){
        return array;
    }

}
