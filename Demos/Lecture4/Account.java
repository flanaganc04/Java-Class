package CS201.Demos.Lecture4;
import java.util.Scanner;
public class Account {
    public static void main (String [] args) {
        System.out.println("Hello acount user, welcome to your balance, we will be using your account balance to calculate how much interest you will earn on that money in 1 months");
        System.out.println("Enter your account balance in dollar");
        float accountBalance;
        try (Scanner keyboard = new Scanner (System.in)) {
            accountBalance = keyboard.nextFloat();
        }
        System.out.println("Now we need an interest rate, for accounts over $1000 the rate is 3%. For accounts under $1000 the rate is 1%)");
        float interestRate = 0; 
        if (accountBalance > 1000) {interestRate = (float) 0.03;}
        if (accountBalance < 1000) {interestRate = (float) 0.01;}
        System.out.println("Your interst rate is");
        System.out.println(interestRate);
        System.out.println("Here is how much money your account would make in one month based off your interest rate");
        System.out.println(accountBalance * interestRate);
        
        
    }
}
