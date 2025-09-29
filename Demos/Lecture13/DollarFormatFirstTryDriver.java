package CS201.Demos.Lecture13;

import java.util.Scanner;
public class DollarFormatFirstTryDriver
{
    public static void main (String [] args)
    {
        double amount;
        String response;
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Testing DollarFormat.write:");
        do
        {
            System.out.println ("Enter a value of type double:");
                amount = keyboard.nextDouble ();
            DollarFormat.write (amount);
            System.out.println ();
            System.out.println ("Test again?");
            response = keyboard.next ();
        }
        while (response.equalsIgnoreCase ("yes"));
        System.out.println ("End of test.");
    }
}
