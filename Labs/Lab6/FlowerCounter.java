package CS201.Labs.Lab6;
import java.util.Scanner;

public class FlowerCounter {
    public static void main(String[] args) {

        String [] flowers = new String [5];

        String petunia = "petunia";
        String pansy = "pansy";
        String rose = "rose";
        String violet = "violet";
        String carnation = "carnation";

        flowers[0] = petunia;
        flowers[1] = pansy;
        flowers[2] = rose;
        flowers[3] = violet;
        flowers[4] = carnation;

        Double [] prices = new Double[5];

        Double petuniaPrice = 0.50;
        Double pansyPrice = 0.75;
        Double rosePrice = 1.50;
        Double violetPrice = 0.50;
        Double carnationPrice = 0.80;

    
        prices[0] = petuniaPrice;
        prices[1] = pansyPrice;
        prices[2] = rosePrice;
        prices[3] = violetPrice;
        prices[4] = carnationPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the type of flower you would like to purchase:");
        String flowerWanted = keyboard.nextLine();

        if (flowerWanted.equalsIgnoreCase(pansy))
        {System.out.println("Next, enter the whole number of pansies that you would like to purchase");}
        else {
            System.out.println("Next, enter the whole number of " + flowerWanted + "s that you would like to purchase");
        }
        int amount = keyboard.nextInt();

        if (flowerWanted.equalsIgnoreCase(flowers[0])) {
            System.out.println(prices[0] * amount);
        }
        if (flowerWanted.equalsIgnoreCase(flowers[1])) {
            System.out.println(prices[1] * amount);
        }
        if (flowerWanted.equalsIgnoreCase(flowers[2])) {
            System.out.println(prices[2] * amount);
        }
        if (flowerWanted.equalsIgnoreCase(flowers[3])) {
            System.out.println(prices[3] * amount);
        }
        if (flowerWanted.equalsIgnoreCase(flowers[4])) {
            System.out.println(prices[4] * amount);
        }
        else {
            System.out.println("An error has occured. Would you like to restart yes or no?");
        }

       
    }
}
