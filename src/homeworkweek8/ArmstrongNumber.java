package homeworkweek8;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void number(){
        int num,number,cal,total=0;
        System.out.println("Enter a number");//print statement
        Scanner scanner=new Scanner(System.in);//scanner class
        num=scanner.nextInt();
        scanner.close();
        number=num;

        while(number!=0)//while statement
        {
            cal=number%10;
            total=total+cal*cal*cal;
            number/=10;
        }

        if(total==num)//if else statement
            System.out.println(num + "is an armstrong number");
        else
            System.out.println(num + "is not an armstrong number");

    }

    public static void main(String[] args) {
     ArmstrongNumber.number();

    }
}

