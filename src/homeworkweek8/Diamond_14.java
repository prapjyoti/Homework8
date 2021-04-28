package homeworkweek8;/*
Write a program in Java to display the pattern like a diamond.
While loop
        *
       ***
      *****
     *******
    *********
   ***********
  *************
   ***********
    *********
     *******
      *****
       ***
        *

*/


import java.util.Scanner;

public class Diamond_14 {

    public static void pattern() {
        Scanner sc=new Scanner(System.in);//scanner class
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        System.out.println("Enter symbol: ");
        char c = sc.next().charAt(0);

       int i=1;//variable
       int j;//variable
       while(i<=n)//use while statement
       {
           j=1;
           while(j++<=n-i)
           {
               System.out.print(" ");
           }
           j=1;
           while(j++<=i*2-1)
           {
               System.out.print(c);
           }
           System.out.println();
           i++;
         }
        i=n-1;
        while(i>0)
        {
         j=1;
         while(j++<=n-i)
         {
             System.out.print(" ");
         }
         j=1;
         while(j++<=i*2-1)
         {
             System.out.print(c);
         }
            System.out.println();
         i--;
        }

    }


    public static void main(String[] args) {
        Diamond_14.pattern();
    }
 }
