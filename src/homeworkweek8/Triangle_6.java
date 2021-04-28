package homeworkweek8;
/*
Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangle_6 {
    public static void pattern(){

        for(int i=1;i<=10;i++) {//print 1 to 10 number

            for (int j =1; j <= i; j++)//print triangle

                System.out.print(j );

            System.out.println(" ");
        }

        }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print the number of row");
        int row = sc.nextInt();
        Triangle_6.pattern();
    }
}
