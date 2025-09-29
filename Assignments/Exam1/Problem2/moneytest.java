package CS201.Assignments.Exam1.Problem2;
import java.util.Scanner;

public class moneytest {

    public static void main(String[] args) {
        double amount, originalAmount;
        double  Galleons, Sickles, Knuts;

        
        Scanner keyboard = new Scanner (System.in);
        amount = keyboard.nextDouble();
        originalAmount = amount;
        
        Galleons = Math.floor(amount / 6.64);
        amount = amount % 6.64;
        System.out.println(amount);
        System.out.println(6.64/17);

        Sickles = Math.floor((amount/6.64) * 17);
        amount = (amount) % (6.64/17);
        System.out.println(amount);

        Knuts = Math.floor((amount/6.64) * 493);
        System.out.println (originalAmount +
                " cents in coins can be given as:");
        
        System.out.println (Galleons + " galleons and");
        System.out.println (Sickles + " sickles and");
        System.out.println (Knuts + " knuts");
    }
}