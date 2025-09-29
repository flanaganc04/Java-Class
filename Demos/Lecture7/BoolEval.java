package CS201.Demos.Lecture7;

import java.util.Scanner;
public class BoolEval {
    
    public static void main (String [] args)
    {
        boolean booleanVar = false;
        System.out.println(booleanVar);
        System.out.println("Enter a boolean value:");
        Scanner keyboard = new Scanner(System.in);
        booleanVar = keyboard.nextBoolean();
        System.out.println("You entered " + booleanVar);
    }
}




// boolean booleanVar = false;
// System.out.println(booleanVar);
// System.out.println("Enter a boolean value:");
// Scanner keyboard = new Scanner(System.in);
// booleanVar = keyboard.nextBoolean();
// System.out.println("You entered " + booleanVar);
