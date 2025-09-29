package CS201.Labs.Lab2;
import java.util.Scanner;
public class BMR {
    public static void main(String[] args) {
        System.out.println("This program is meant to display a person's Basal Metabolic Rate (BMR). BMR is the amount of calories required to maintain your weight if you dont exercise. To do that a gender, height in inches, weight in pounds and age in years are required.");
        float height, weight, age;
        String gender;
        // Need to create varibles to save the users height, weight, age, and gender
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Please enter your height in inches:");
            height = keyboard.nextFloat();
            System.out.println(height);
            System.out.println("Please enter your weight in pounds:"); 
            weight = keyboard.nextFloat();
            System.out.println(weight);
            System.out.println("Please enter your age in years:"); 
            age = keyboard.nextFloat(); 
            System.out.println(age);
            System.out.println("Are you 'male' or 'female': (please type one or the other)");
            gender = keyboard.next();
        }
        //This part of the code allows the user to input said height, age, weight, and their gender.
    if (
        gender.equalsIgnoreCase("male")) {
            //If they are male this block is executed
            //Proposition is either true or false, boolean values are true or false so the condition male is either true or false
            // = assigns a variable
            // == compares two variables
            System.out.println("The BMR calculation for a male is as follows (66 + (6.3 * weight in pounds) + (12.9 * height in inches) + (6.8 * age in years))");
            double bmr = 66 + (6.3 * weight) + (12.9 * height) + (6.8 * age);
            System.out.println("Here is your BMR");
            System.out.println(bmr);
            System.out.println("Fun Fact: A typical chocolate bar contains 230 calories. Therefore, if you just ate chocolate bars during the day you would need to eat is");
            double bars = (bmr/230);
            System.out.println(bars);
        }
    // If: this section tells the computer if the variable gender = male to do the BMR calculations for males and to output this information on the screen.
    else {
        { //If female this block is executed
            System.out.println("The BMR calculation for a female is as follows (665 + (4.3 * weight in pounds) + (4.7 * height in inches) + (4.7 * age in years))");
            double bmr = 655 + (4.3 * weight) + (4.7 * height) + (4.7 * age);
            System.out.println("Here is your BMR");
            System.out.println(bmr);
            System.out.println("Fun Fact: A typical chocolate bar contains 230 calories. Therefore, if you just ate chocolate bars during the day you would need to eat is");
            double bars = (bmr/230);
            System.out.println(bars);
            }
        }
    //Else: if the if conditions are not meant "so assuming the user types female" 
    }
}
