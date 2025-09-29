package CS201.Assignments.Exam1.Problem3;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int F0 = 0, F1=1, i, F;
        
        System.out.println("This program calculates the Fibonacci's numbers");
        System.out.println("The program breaks after 50 iterations");
        System.out.println("Ener the number of the Fibonacci sequence that you would like to see:");


        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();

        System.out.println(0);
        System.out.println(1);
        for (i=2;i<n;i++){
            F = F0 + F1;
            System.out.println(F);
            F0=F1;
            F1=F;
            
        }
    }
}
