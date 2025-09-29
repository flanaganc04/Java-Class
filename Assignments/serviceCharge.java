package CS201.Assignments;
import java.util.Scanner;

public class serviceCharge {
    public static void main(String[] args) {
        float checkAmount = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("We are going to calculate the service fee at the Computer Science 201 Bank");
        System.out.println("If the check amount is less than $10, we will charge $1. If the amount is greater\r\n" + //
                        "than $10 but less than $100, we will charge 10% of the amount. If the amount is greater than $100,\r\n" + //
                        "but less than $1,000, we will charge $5 plus 5% of the amount. If the value is over $1,000, we will\r\n" + //
                        "charge $40 plus 1% of the amount.");

                        System.out.println("Please enter the amount of the check you would like to deposit");
                        
                        checkAmount = keyboard.nextFloat();
                        float fee = 0;




                        if (checkAmount > 1000) {
                            
                            fee = (checkAmount * (float)0.01) + 40;
                            System.out.println("The fee on the check would be $" + fee);
                            System.out.println("The amount deposited would be $" + (checkAmount-fee));

                        }
                        else if (checkAmount > 100) {
                            
                            fee = (checkAmount * (float)0.05) + 5;
                            System.out.println("The fee on the check would be $" + fee);
                            System.out.println("The amount deposited would be $" + (checkAmount-fee));

                        }
                        else if (checkAmount > 10) {
                            fee = (checkAmount * (float)0.1);
                            System.out.println("The fee on the check would be $" + fee);
                            System.out.println("The amount deposited would be $" + (checkAmount-fee));
                        }
                        else {
                            fee = 1;
                            System.out.println("The fee on the check would be $" + fee);
                            System.out.println("The amount deposited would be $" + (checkAmount-fee));
                        }

    }
}
