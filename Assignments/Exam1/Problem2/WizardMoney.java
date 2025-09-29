package CS201.Assignments.Exam1.Problem2;
import java.util.Scanner;

public class WizardMoney {
    public static void main(String[] args) {

        System.out.println("This programs converts USD to Wizard money Galleons, Sickles, and Knuts");

        Scanner keyboard = new Scanner(System.in);
        String restartAnswer;
        
        do {

        System.out.println("Will your conversion be from USD to Wizard money? If so, type the number 1. If you wish to convert from Wizard money to USD type the number 2.");

        int conversionAnswer = 0;
        conversionAnswer = keyboard.nextInt();
        

        switch (conversionAnswer) {
            case 1:

                System.out.println("Please type the amount of USD that you would like to convert. For example if you had one hundred dollars and 3 cents you would input 100.03:");

                double amount, originalAmount;
                double  Galleons, Sickles, Knuts;

                amount = keyboard.nextDouble();

                if (amount < 0){
                    System.out.println("Cannot convert negative values of money!");
                }
                else{
                    originalAmount = amount;
                
                    Galleons = Math.floor(amount / 6.64);
                    amount = amount % 6.64;
                    

                    Sickles = Math.floor((amount/6.64) * 17);
                    amount = (amount) % (6.64/17);
                    

                    Knuts = Math.floor((amount/6.64) * 493);

                    System.out.println ("$" + originalAmount +
                            " can be given as:");
                    
                    System.out.println (Galleons + " galleons and");
                    System.out.println (Sickles + " sickles and");
                    System.out.println (Knuts + " knuts");}

                break;

            case 2:

                System.out.println("You have selected to convert from Wizard to USD. Wizard money only come in whole number values!");
                System.out.println("Please enter the whole number of Galleons you have:");

                Galleons = keyboard.nextInt();

                if (Galleons < 0) {
                    System.out.println("Cannot convert negative values of money!");
                    break;
                }

                System.out.println("Please enter the whole number of Sickles you have:");

                Sickles = keyboard.nextInt();

                if (Sickles < 0) {
                    System.out.println("Cannot convert negative values of money!");
                    break;
                }
                
                System.out.println("Please enter the whole number of Knuts you have:");

                Knuts = keyboard.nextInt();

                if (Knuts < 0) {
                    System.out.println("Cannot convert negative values of money!");
                    break;
                }
                
                //1 sickle = 29 knuts 
                //1 galleon = 493 knuts
                //normalize to knuts, add, divide by 493 to get galleons

                int newGalleons = (int)Galleons*493;
                int newSickles = (int)Sickles*29;

                double galleonUnrounded = (int) Knuts + newGalleons + newSickles;
                double cents = ((galleonUnrounded/493)*6.64)*100;

                int dollars = (int) Math.floor(cents) / 100;
                int newCents = (int) cents % 100;

                System.out.print("$");
                System.out.print(dollars);
                System.out.print(".");

                if (newCents < 10) {
                    System.out.print("0");
                    System.out.print(newCents);
                    System.out.println("");
                }
                else {

                    System.out.print(newCents);
                    System.out.println("");

                }
                
                break;
            
            default:

                System.out.println("The number or symbols you have typed are not correct.Type the number 1 to convert from USD to Wizard. OR type the number 2 to convert from Wizard to Money!");

                break;
        }

        System.out.println("Would you like to make another conversion? Type yes or no:");

        restartAnswer = keyboard.next();}

        while (restartAnswer.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using Wizard Money converter");

    }

}
