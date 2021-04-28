package homeworkweek8;

import java.util.Scanner;

/*
Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */
public class Vowel_3 {

    public static void letter(){

        Scanner sc=new Scanner(System.in);//scanner class
        System.out.print("Input an alphabet");
        String insert;
         insert=sc.next().toLowerCase();//obj of scanner

        boolean uppercase=insert.charAt(0) >=65 && insert.charAt(0) <=90;//condition//lowecase number char
        boolean lowercase=insert.charAt(0) >=97 && insert.charAt(0) <=122;//lowercase
        boolean vowels=insert.equals("a") || insert.equals("e")||insert.equals("i")||insert.equals("0")||insert.equals("u");
        if(insert.length()>1){//if conditio
            System.out.println("Error:not a single character.");//if body

        }else if(!(uppercase||lowercase)){//else if statement
            System.out.println("Error:not a letter.Enter uppercase or lowercase letter.");

        }else if(vowels){
            System.out.println("input letter is vowel");
        }else {
            System.out.println("input letter is Consonant");
        }

        }



    public static void main(String[] args) {
        Vowel_3.letter();

    }
}
