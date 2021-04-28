package homeworkweek8;
/*
Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
*/


/*import java.util.Scanner;

public class MinAndMaxInputChallenge_2 {
    static void cha() {

        int max = 0;
        int min = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);//input Scanner
        while (true) {
            System.out.println("Enter Number");
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt) {
                int number = sc.hasNextInt();
                boolean value = false;
                if (value) {
                    min = number;
                    num += 1;
                    if(hasNextInt){
                        value = false;
                        if (value) {
                            min=number;
                            max=number;
                        }
                        if (number > max) {
                           max=number;
                        } else if (number < min) {
                            min=number;
                        }
                        if (num==10){
                            break;
                        }else{
                            System.out.println("Invalid number");
                            break;

                        }
                    }
                    sc.nextLine();
                }
            }
        }
        System.out.println("The Minimum number"+min);
        System.out.println("The Maximum number"+max);
        sc.close();

    }

    public static void main(String[] args) {
        MinAndMaxInputChallenge_2 obj=new MinAndMaxInputChallenge_2();
        obj.cha();
    }
}

 */