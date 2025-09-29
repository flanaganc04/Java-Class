package CS201.Labs.Lab4;
import java.util.Scanner;

public class SumOdd {

    public static void main(String[] args) {
        System.out.println("This program is designed to sum the first n positive odd integers");
        System.out.println("For example if n is 5 you would compute 1 + 3 + 5 + 7 + 9");
        System.out.println("Enter the number of odd integers you would like to sum");

        Scanner keyboard = new Scanner(System.in);
        final int n = keyboard.nextInt();


        System.out.println("Here is their sum");
        System.out.println((n+1)*(n+1));

        System.out.println("This sum was found using the definition of an odd number where there exists some number(l) such that two times another number (w) plus one equals l.");
        System.out.println("The series to be examined will be 2n+1. By using Gauss' trick of summing a series where you add the first and last digits of the series, multiply it by the number of digits in the series, then divide by 2 we are able to compute the sum with a basic function.");

    }
}