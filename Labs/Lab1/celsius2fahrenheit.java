package CS201.Labs.Lab1;
import java.util.Scanner;
class celsius2fahrenheit 
{
    public static void main (String [] args)
    {
        System.out.println ("Hello out there.");
        System.out.println ("I will convert Celsius to Fahrenheit.");
        System.out.println ("Enter the temperature in degrees Celsius:");
        float temperature;
        try (Scanner keyboard = new Scanner (System.in)) {
            temperature = keyboard.nextFloat();
        }
        System.out.println ("The temperature in degrees Fahrenheit is");
        System.out.println (temperature * 9/5 +32);
    } 
}