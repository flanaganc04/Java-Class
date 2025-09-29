package CS201.Assignments.Exam1.Problem2;

import java.util.Scanner;

public class HarryPotter {
    public static void main(String[] args) {
        
    

    System.out.println("Welcome to Harry Potter land, the land of magical money. We have all kinds of magic money like Gallleons, Sickles, and Knuts.");
    System.out.println("This program will allow you to convert between any of the currencies.");
    System.out.println("First we need to know the currency that you want to start with");

String answer;
do {
    String currency,
            newcurrency,
            Galleons = "Galleons",
            Sickles = "Sickles",
            Knuts = "Knuts",
            Dollars = "Dollars";

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the type of money you would like to start with, \"Dollars\", \"Galleons\", \"Sickles\", or \"Knuts\".");
    currency = keyboard.nextLine();

    
    
    

    if (currency.equals(Dollars)) {
        System.out.println("Next enter the amount you have of your " + currency);
    float amount = keyboard.nextFloat();
        System.out.println("Next we need to know the type of currency you would like to convert to again type \"Dollars\", \"Galleons\", \"Sickles\", or \"Knuts\".");
        Scanner keyboard1 = new Scanner(System.in);
        newcurrency = keyboard1.nextLine();

        if (newcurrency.equals(Dollars)) {
            System.out.println("You have $" + amount);
            
        }
        if (newcurrency.equals(Galleons)) {
            amount = (float) (amount/6.64);
            System.out.println("You have " + amount + " Galleons");
        }
        if (newcurrency.equals(Sickles)) {
            amount = (float) ((amount*17)/6.64);
            System.out.println("You have " + amount + " Sickles");
        }
        if (newcurrency.equals(Knuts)) {
            amount = (float) ((amount*493)/6.64);
            System.out.println("You have " + amount + " Knuts");
        }
    }
    
      
    
    
    if (currency.equals(Galleons)) {
        System.out.println("Next enter the amount you have of your " + currency);
    float amount = keyboard.nextFloat();
        System.out.println("Next we need to know the type of currency you would like to convert to again type \"Dollars\", \"Galleons\", \"Sickles\", or \"Knuts\".");
        Scanner keyboard1 = new Scanner(System.in);
        newcurrency = keyboard1.nextLine();

        if (newcurrency.equals(Galleons)) {
            System.out.println("You have " + amount + " Galleons");
        }
        if (newcurrency.equals(Dollars)) {
            amount = (float) (amount*6.64);
            System.out.println("You have $" + amount);
        }
        if (newcurrency.equals(Sickles)) {
            amount = (float) amount*17;
            System.out.println("You have " + amount + " Sickles");
        }
        if (newcurrency.equals(Knuts)) {
            amount = (float) amount*493;
            System.out.println("You have " + amount + " Knuts");
        }
    
    }
    if (currency.equals(Sickles)) {
        System.out.println("Next enter the amount you have of your " + currency);
    float amount = keyboard.nextFloat();
        System.out.println("Next we need to know the type of currency you would like to convert to again type \"Dollars\", \"Galleons\", \"Sickles\", or \"Knuts\".");
        Scanner keyboard1 = new Scanner(System.in);
        newcurrency = keyboard1.nextLine();

        if (newcurrency.equals(Sickles)) {
            System.out.println("You have " + amount + " Sickles");
        }
        if (newcurrency.equals(Galleons)) {
            amount = (float) (amount/17);
            System.out.println("You have " + amount + " Galleons");
        }
        if (newcurrency.equals(Dollars)) {
            amount = (float) ((amount*6.64)/17);
            System.out.println("You have $" + amount);
        }
        if (newcurrency.equals(Knuts)) {
            amount = (float) ((amount*493)/17);
            System.out.println("You have " + amount + " Knuts");
        }
    
    }
    
    if (currency.equals(Knuts)) {
        System.out.println("Next enter the amount you have of your " + currency);
    float amount = keyboard.nextFloat();
        System.out.println("Next we need to know the type of currency you would like to convert to again type \"Dollars\", \"Galleons\", \"Sickles\", or \"Knuts\".");
        Scanner keyboard1 = new Scanner(System.in);
        newcurrency = keyboard1.nextLine();
        
        if (newcurrency.equals(Knuts)) {
            System.out.println("You have " + amount + " Knuts");
        }
        if (newcurrency.equals(Galleons)) {
            amount = (float) (amount/493);
            System.out.println("You have " + amount + " Galleons");
        }
        if (newcurrency.equals(Sickles)) {
            amount = (float) ((amount*17)/493);
            System.out.println("You have " + amount + " Sickles");
        }
        if (newcurrency.equals(Dollars)) {
            amount = (float) ((amount*6.64)/493);
            System.out.println("You have $" + amount);
        }
    }
    Scanner keyboard2 = new Scanner(System.in);
            System.out.println("Either you've made an error or you have come to the conclusion of the program. Would you like to do this again yes or no?");
            answer = keyboard2.nextLine();
    
}
while (answer.equalsIgnoreCase("yes"));

}
}


