import java.util.Random;
import java.util.Scanner;
class Average {
    public static void main(String[] args) {
        System.out.println("This program is built to read three whole numbers and display the average of the three numbers");
        System.out.println("For example:");
        int number1, number2, number3;
        Random rand = new Random();
        number1 = rand.nextInt(101);
        number2 = rand.nextInt(101);
        number3 = rand.nextInt(101);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println("The average of these three numbers is their total divided by three, or the number of objects you wish to average");
        double average1 = (number1 + number2 + number3)/3.0;
        System.out.println(average1);

        System.out.println("Now you can enter three numbers you wish to take an average of:");
        double number4, number5, number6;
        try (Scanner keyboard = new Scanner(System.in)) {number4 = keyboard.nextDouble(); number5 = keyboard.nextDouble(); number6 = keyboard.nextDouble();}
        System.out.println("Here are the three number you selected and below it their average:");
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
        double average2 = (number4 + number5 +number6)/3;
        System.out.println(average2);
    }
}
