package homeworkweek8;
/*
 Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,such as 2 in 12 and 23;otherwise,the method should return false.

* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

 */

import javax.xml.bind.SchemaOutputResolver;

public class SharedDigit {


    public static boolean hasSharedDigit(int number1, int number2) {

        if ((number1 < 10 || number2 < 10) || (number1 > 99 || number2 > 99)) {//logic for range (if condition)
            return false;
        }

        while (number1 > 0) {
            int firstfirst = number1 / 10;
            int firstlast = number1 % 10;
            int secondfirst = number2 / 10;
            int secondlast = number2 % 10;


            return (firstlast == secondlast ||
                    firstlast == secondfirst ||
                    firstfirst == secondfirst ||
                    firstfirst == secondlast);
        }


        return false;
    }

    public static void main(String[] args) {
        System.out.println(SharedDigit.hasSharedDigit(12,23));
        System.out.println(SharedDigit.hasSharedDigit(9,99));
        System.out.println(SharedDigit.hasSharedDigit(15,55));

    }
}
