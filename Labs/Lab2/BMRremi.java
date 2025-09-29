package CS201.Labs.Lab2;
import java.util.Scanner;
public class BMRremi {
    public static void main (String [] args)
    { 
        int weight, height, age;
        String gender = "male";
        try(Scanner keyboard = new Scanner (System.in)) { 
            System.out.println ("Are you male or female?");
            gender = keyboard.next (); 
            gender = gender.trim ();
            //System.out.println(gender);
            if (gender.equalsIgnoreCase("male")) {
                System.out.println ("Via your BMR, I will predict the number of 230 calorie chocolate bars to be consumed to maintain your weight");
                System.out.println ("Enter your weight in pounds:");
                weight = keyboard.nextInt ();
                System.out.println ("Enter your height in inches:");
                height = keyboard.nextInt ();
                System.out.println ("Enter your age in years:");
                age = keyboard.nextInt ();
            
                System.out.println ("Your BMR is:");
                System.out.println (66+(6.3*weight)+(12.9*height)-(6.8*age));
                System.out.println ("The number of candy bars you can eat while staying the same weight is:");
                System.out.println ((66+(6.3*weight)+(12.9*height)-(6.8*age))/230);
            } 
            else {
                System.out.println ("Via your BMR, I will predict the number of 230 calorie chocolate bars to be consumed to maintain your weight");
                System.out.println ("Enter your weight in pounds:");
                weight = keyboard.nextInt ();
                System.out.println ("Enter your height in inches:");
                height = keyboard.nextInt ();
                System.out.println ("Enter your age in years:");
                age = keyboard.nextInt ();
            
                System.out.println ("Your BMR is:");
                System.out.println (655+(4.3*weight)+(4.7*height)-(4.7*age));
                System.out.println ("The number of candy bars you can eat while staying the same weight is:");
                System.out.println ((655+(4.3*weight)+(4.7*height)-(4.7*age))/230);    
            }
        }
    }    
}