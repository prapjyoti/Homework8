package homeworkweek8;
/*
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal
to the original number. For example: 121, 12321, and 1001 etc.
Tip: Logic to check a palindrome number
Find the reverse of the given number. Store it in some variable say reverse. Compare the number with
reverse.
If both are the same then the number is a palindrome otherwise its not
 */

public class PalindromeNub5 {
public static boolean isPalindrome(int number){
    int lastdigit=0;//variable store the last digit value
    int reverse=0;//store reverse number value
    int value=number;//store value given

    while(number!=0||number>0){
        lastdigit=number%10;
        reverse=reverse*10;
        reverse+=lastdigit;//reverse+lastdigit
        number/=10;
    }
    if(value==reverse){
        return true;
    }

    return false;
}

    public static void main(String[] args) {
        boolean math=isPalindrome(121);
        System.out.println(math);
        boolean math1=isPalindrome(12321);
        System.out.println(math1);
        boolean math2=isPalindrome(1000);
        System.out.println(math2);
    }
}
