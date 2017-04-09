package kennethlimcp.timeboxtest;

/**
 * Created by kennethlimcp on 09/Apr/2017.
 */

public class PhonePad {
     public int getPressesFromChar(char input) {
         int numericValue = (int) Character.toLowerCase(input) - 0x61;

//        a to o
        if(numericValue < 15)
            numericValue = numericValue % 3;
//        p to s
        else if(numericValue < 19)
            numericValue = numericValue - 15;
//        t to v
        else if(numericValue < 22)
            numericValue = numericValue - 19;
//        w to z
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
}
