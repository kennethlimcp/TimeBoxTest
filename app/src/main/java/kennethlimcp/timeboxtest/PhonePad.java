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
         return "test";
     }
}
