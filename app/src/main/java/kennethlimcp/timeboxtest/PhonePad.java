package kennethlimcp.timeboxtest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kennethlimcp on 09/Apr/2017.
 */

public class PhonePad {

     public int getPressesFromChar(char input) {
         int numericValue = (int) Character.toLowerCase(input);

         //check that it's a valid a-z char else return negative value
         if(numericValue < 0x61 || numericValue > 0x7A)
             return -1;

         //offset from ascii 'a' to start from index 0
         numericValue = numericValue - 0x61;

        //a to o
        if(numericValue < 15)
            numericValue = numericValue % 3;
        //p to s
        else if(numericValue < 19)
            numericValue = numericValue - 15;
        //t to v
        else if(numericValue < 22)
            numericValue = numericValue - 19;
        //w to z
         else
            numericValue = numericValue - 22;

         return numericValue + 1;
     }

     public int getPressesFromString(String s) {
         int presses = 0;

         for(char c : s.toCharArray()) {
             presses += getPressesFromChar(c);
         }

         return presses;
     }

     public String getNumberRepOfWord(String s) {
         s = s.toLowerCase();

         String retStr = "";

         for(char c : s.toCharArray()) {
             retStr += getNumberRepOfChar(c);
         }
         return retStr;
     }

     public int getNumberRepOfChar(char c) {
         int returnValue = 0;

         if(c <= 'c')
             returnValue = 2;
         else if (c <= 'f')
             returnValue = 3;
         else if (c <= 'i')
             returnValue = 4;
         else if (c <= 'l')
             returnValue = 5;
         else if (c <= 'o')
             returnValue = 6;
         else if (c <= 's')
             returnValue = 7;
         else if (c <= 'v')
             returnValue = 8;
         else if (c <= 'z')
             returnValue = 9;

         return returnValue;
     }

    public List getWordCombisFromNum(String number) throws Exception {
        String[] padLetters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> wordsList = new LinkedList();
        wordsList.add("");

        for(int i=0; i< number.length(); i++) {
            //Our array starts at 0 so we have to offset by ascii '2'
            int padNumber = number.charAt(i) - '2';

            if(padNumber < 0 || padNumber > 9) throw new InputMismatchException();

            //check the number of prefix
            int count = wordsList.size();

            for(int j=0; j<count; j++) {
                String prefix = wordsList.remove(0);

                for(int k=0; k < padLetters[padNumber].length(); k++) {
                    wordsList.add(prefix + padLetters[padNumber].charAt(k));
                }
            }
        }

        return wordsList;

    }


     public List getPossibleWordsFromNum(String number) {
         List<String> words = new LinkedList<String>();

         //Path to be changed depending on environment
         String wordsFile = ("/Users/kennethlimcp/Desktop/" +
                 "TimeBoxTest/app/src/main/java/kennethlimcp/timeboxtest/words.txt");
         BufferedReader reader;
         FileReader fr;
         String word = "";

         try {
             fr = new FileReader(wordsFile);
             reader = new BufferedReader(fr);

             while ((word = reader.readLine()) != null) {
                 if(number.equals(getNumberRepOfWord(word))) {
                     words.add(word);
                 }
             }
             fr.close();

         } catch (Exception e) {
             e.printStackTrace();
         }

         return words;
     }
}
