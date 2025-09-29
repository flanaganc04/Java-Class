
import java.util.Scanner;

public class FlowerCounter {
    static String answer = "yes";

    static void setAnswer() {
        Scanner keyboard = new Scanner(System.in);
        answer = keyboard.nextLine();
    }
    public static void main(String[] args) {

        String [] flowerArray = new String [5];
        Double [] priceArray = new Double[5];

        String petunia = "Petunia";
        String pansy = "Pansy";
        String rose = "Rose";
        String violet = "Violet";
        String carnation = "Carnation";
        

        Double petuniaPrice = 0.50;
        Double pansyPrice = 0.75;
        Double rosePrice = 1.50;
        Double violetPrice = 0.50;
        Double carnationPrice = 0.80;

        flowerArray[0] = petunia;
        flowerArray[1] = pansy;
        flowerArray[2] = rose;
        flowerArray[3] = violet;
        flowerArray[4] = carnation;
    
        priceArray[0] = petuniaPrice;
        priceArray[1] = pansyPrice;
        priceArray[2] = rosePrice;
        priceArray[3] = violetPrice;
        priceArray[4] = carnationPrice;

        System.out.println("Welcome to the flower shop! Here is our menu:");
        for(int i = 0; i < 5; i++) {
            System.out.println(flowerArray[i] + " $" + priceArray[i]);
        }
        System.out.println(" ");

        do{
            Scanner keyboard = new Scanner(System.in);

            
            System.out.println("Enter which flower you would like:");
            String flowerWanted = keyboard.nextLine();

            if (flowerWanted.equalsIgnoreCase(pansy))
            {System.out.println("Enter the whole number of pansies that you would like to purchase:");}
            else {
                System.out.println("Enter the whole number of " + flowerWanted + "s that you would like to purchase:");
            }

            int amount = keyboard.nextInt();

            if (flowerWanted.equalsIgnoreCase(flowerArray[0])) {
                System.out.print("The price of " + amount + " " + flowerWanted + "s is $");
                System.out.println(priceArray[0] * amount);
                System.out.println("Would you like to restart yes or no?");
                setAnswer();
            }
            else if (flowerWanted.equalsIgnoreCase(flowerArray[1])) {
                System.out.print("The price of " + amount + " pansies is $");
                System.out.println(priceArray[1] * amount);
                System.out.println("Would you like to restart yes or no?");
                setAnswer();
            }
            else if (flowerWanted.equalsIgnoreCase(flowerArray[2])) {
                System.out.print("The price of " + amount + " " + flowerWanted + "s is $");
                System.out.println(priceArray[2] * amount);
                System.out.println("Would you like to restart yes or no?");
                setAnswer();
            }
            else if (flowerWanted.equalsIgnoreCase(flowerArray[3])) {
                System.out.print("The price of " + amount + " " + flowerWanted + "s is $");
                System.out.println(priceArray[3] * amount);
                System.out.println("Would you like to restart yes or no?");
                setAnswer();
            }
            else if (flowerWanted.equalsIgnoreCase(flowerArray[4])) {
                System.out.print("The price of " + amount + " " + flowerWanted + "s is $");
                System.out.println(priceArray[4] * amount);
                System.out.println("Would you like to restart yes or no?");
                setAnswer();
            }
            else {
                System.out.println("An error has occured. Would you like to restart yes or no?");
                setAnswer();
            }
        }
    while (answer.equalsIgnoreCase("yes"));   
    }
}
