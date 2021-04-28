package homeworkweek8;
/*
Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * *

 */

import java.util.Scanner;

public class LeftAngle_15 {
    public static void print() {
        int i, j, row;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();

        for (i = 0; i < row; i++) {//for condition
            for (j = 2 * (row - i); j >= 0; j--) {
                System.out.print("");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
                //System.out.println(" ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        System.out.println("Enter number of row: ");
        LeftAngle_15.print();
    }

}