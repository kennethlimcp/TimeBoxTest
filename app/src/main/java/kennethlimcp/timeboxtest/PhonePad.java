package kennethlimcp.timeboxtest;

/**
 * Created by kennethlimcp on 09/Apr/2017.
 */

public class PhonePad {
     public int getNumberFromChar(char input) {
         int numericValue = (int) Character.toLowerCase(input) - 0x60;

//        a to o
        if(numericValue < 16)
            numericValue = numericValue % 3;
//        p to s
        else if(numericValue < 20)
            numericValue = numericValue - 15;
//        t to v
        else if(numericValue < 23)
            numericValue = numericValue - 20;
//        w to z
         else
            numericValue = numericValue - 22;

         return numericValue;
     }

     public int getPressesFromString(String s) {
         return 0;
     }
}
