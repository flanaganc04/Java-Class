package CS201.Labs.Lab1;
import java.util.Scanner;
class fahrenheit2celsius 
{
    public static void main (String [] args)
    {
        System.out.println ("Hello out there.");
        System.out.println ("I will convert Fahrenheit to Celsius.");
        System.out.println ("Enter the temperature in degrees Fahrenheit:");
        float temperature;
        try (Scanner keyboard = new Scanner (System.in)) {
            temperature = keyboard.nextFloat();
        }
        System.out.println ("The temperature in degrees Ceslius is");
        System.out.println ((temperature-32)*5/9);
    } 
}