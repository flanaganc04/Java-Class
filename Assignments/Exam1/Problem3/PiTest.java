package CS201.Assignments.Exam1.Problem3;
import java.util.Scanner;
public class PiTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program will output the digits of pi by adding the series (4(-1)^n)/(2n+1)");
        System.out.println("After 750 iterations you will have the first three digits: 3.14");
        System.out.println("After 3,000 iterations you will have the first four digits: 3.141");
        System.out.println("After 140,000 iterations you will have the first five digits: 3.1415");
        System.out.println("After 400,000 iterations you will have the first six digits: 3.14159");
        System.out.println("Insert the number of times you would like to compute the sum, the higher the value the more precise the digits of Pi will become:");

        int n = keyboard.nextInt(), i = 0;
        double bigPi = 0, digit = 0;

        for (i=0; i<n; i++) {
            digit = (4*Math.pow(-1,i))/(2*i + 1);
            bigPi += digit;

            System.out.println(bigPi);
        }
    }
    
}
