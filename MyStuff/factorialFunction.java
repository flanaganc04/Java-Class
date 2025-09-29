package CS201.MyStuff;

import java.util.Scanner;
/* 
 * The long modifier can only handle factorial upto 20. After 20 the computer returns negative value which are inherently wrong.
*/
public class factorialFunction {
    static long fact;

    public static void factorialPretty(int n) {
        if (n==0) {
            fact = 1;
            System.out.println(fact);
        }
        if (n == 1) {
            fact = 1;
            System.out.println(fact);
        }
        else {
            fact = 1;
            System.out.println("0! = " + fact);
            System.out.println("1! = " + fact);
            for(int i = 2; i <= n; i++) {
                long newfact = fact * i;
                fact = newfact;
                System.out.println(i + "! = " + fact);
            }
        }
    }

    public static long factorialInt(int n) {
        if (n==0) {
            fact = 1;
        }
        if (n == 1) {
            fact = 1;
        }
        else {
            fact = 1;
            for(int i = 2; i <= n; i++) {
                long newfact = fact * i;
                fact = newfact;
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        double euler = 0;
       
        int k = keyboard.nextInt();
        for (int i=0;i<k;i++) {
            
            
            double number = (double)1/factorialInt(i);
            double newEuler = euler + number;
            euler = newEuler;
            System.out.println(euler);
            
        }
        
    }
}
