package homeworkweek8;
/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative.
 */

public class EvenDigitSum_11 {
    public static int getEvenDigitSum(int number){
        int sum=0;//variable
        int lastdigit=0;//variable
        if(number<0){//invalid value condition
            return  -1;
        }
        while(number>0){//calculatio
            lastdigit=number%10;
            if(number % 2== 0){//check if evennumber
                sum+=lastdigit;
                number/= 10;//number /10 is equal number

            }
            else{
                number /= 10;//check if odd number
                continue;//keep loop going
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int sum,sum1,sum2,sum3=0;
        sum= EvenDigitSum_11.getEvenDigitSum(252);
        System.out.println("sum of Evendigit: "+sum);
        sum1=EvenDigitSum_11.getEvenDigitSum(123456789);
        System.out.println("sum of Evendigit: "+sum1);
        sum2=EvenDigitSum_11.getEvenDigitSum(-22);
        System.out.println("sum of Evendigit: "+sum2);
        sum3=EvenDigitSum_11.getEvenDigitSum(256);
        System.out.println("sum of Evendigit:"+sum3);
    }
}
