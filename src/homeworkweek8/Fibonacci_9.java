package homeworkweek8;
/*
Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */


import java.util.Scanner;

public class Fibonacci_9 {

    static int count, num1 = 0, num2 = 1;//variable declare with static keyword as in instance area

    static void fib(int count) {//static method with 1 parameter
        int i =1;
        while (i <= count) {//condition for loop
            System.out.println(num1 + "  ");
            int add = num1 + num2;//while body (logic of programme)
            num1 = num2;
            num2 = add;
            i++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner object created
        System.out.println("Fibonacci number " +   "is");
        count = sc.nextInt();
        Fibonacci_9.fib(7);


    }
}