package CS201.Assignments.Exam1.Problem3;

import java.util.Scanner;



public class e {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Eulers number or e is a non terminating decimal constant that is evaluated by taking the sum of the series 1/n!");
        System.out.println("Input the number of times you would like to add the series (to what value of n would you like to take the series, the higher n is the more precise the values of e will be):");
        int input = keyboard.nextInt();
        System.out.println(euler(input));

        
}
public static int factorial(int n) {
        if (n==0|| n==1) {
            return 1;
        }
        else {
            return n*factorial(n - 1);
        }
}
public static double euler(int n) {
    double e = 0;
    for (int i = 0; i<n; i++) {
        e += 1.0 / factorial(i);
    }
    return e;
}
}
