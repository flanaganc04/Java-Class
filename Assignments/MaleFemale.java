package CS201.Assignments;
import java.util.Scanner;

public class MaleFemale {
    public static void main(String[] args) {
        int males, females, total;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program is designed to tell you the percentage of males and females in your class");

        System.out.println("Please enter the number (please type an integer) of males in your class");
        males = keyboard.nextInt();

        System.out.println("Please enter the number (please type an integer) of females in your class");
        females = keyboard.nextInt();

        total = females + males;
        float malePerc, femalePerc;
        malePerc = ((float)males/(float)total) * (float) 100;
        femalePerc = ((float)females/(float)total) * (float)100;

        System.out.print("The number of total students is ");
        System.out.println(total + " students");

        System.out.print("The percentage of male students is ");
        System.out.println(malePerc + "%");

        System.out.print("The percentage of female students is ");
        System.out.println(femalePerc + "%");
    }
}
