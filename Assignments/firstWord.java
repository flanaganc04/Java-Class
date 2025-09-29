package CS201.Assignments;
import java.util.Scanner;

public class firstWord {
    
    public static void main(String[] args) {
        
        String string;
        
        System.out.println("Enter a string of words, I will try to pull out the first word of the string you wrote.");
        Scanner keyboard = new Scanner(System.in);
        string = keyboard.nextLine();


        System.out.println("Here is your string:");
        String newString = string.trim();
        
        System.out.println(newString);

        String[] substringArray = newString.split("\\s", 0);

       
        System.out.println("Here is the first word:");
        System.out.println(substringArray[0]);

        }
        
        

        
    }

