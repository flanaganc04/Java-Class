package CS201.Assignments;
import java.util.Scanner;
public class BoilerWarning {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program is built to allow the user to input the pressure rating of the boiler you have. The safety factor is three which means no boiler should be operated at a pressure greater than 1/3 of the rated pressure.");
        System.out.println("Enter the pressure rating of the boiler you are using");
        final float burstpressure = keyboard.nextFloat();
        float maxpressure = burstpressure/3;

         

        System.out.println("Enter the current pressure of the boiler.");
        
        float currentpressure = keyboard.nextFloat();

        if (currentpressure >= maxpressure) {
            System.out.println("THE CURRENT PRESSURE OF THE BOILER IS NOT SAFE: PLEASE CONTACT MAINTENANCE!!!");
            
        }
        else {
            System.out.println("The current pressure is safe");
            
        }
        System.out.println("The safe pressure for this device is " + maxpressure);
    }
}
