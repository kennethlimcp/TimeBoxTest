package kennethlimcp.timeboxtest;

/**
 * Created by kennethlimcp on 09/Apr/2017.
 */

public class PhonePad {
     public int getNumberFromChar(char input) {
         int numericValue = (int) Character.toLowerCase(input) - 0x60;

         //p q r s or w x y z
        if(numericValue < 16)
            numericValue = numericValue % 3;
        else if(numericValue < 20)
            numericValue = numericValue - 15;
        else if(numericValue < 23)
            numericValue = numericValue - 20;
         else
            numericValue = numericValue - 22;

         return numericValue;
     }
}
