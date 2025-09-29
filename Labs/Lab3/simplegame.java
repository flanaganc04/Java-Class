package CS201.Labs.Lab3;
import java.util.Random;
import java.util.Scanner;
public class simplegame {
    public static void main(String[] args) {
        String hiddenNumber, guessNumber;
        int number1, number2, number3, number4, number5;
            Random rand = new Random();
            number1 = rand.nextInt(10);
            number2 = rand.nextInt(10);
            number3 = rand.nextInt(10);
            number4 = rand.nextInt(10);
            number5 = rand.nextInt(10);

        System.out.print(number1);System.out.print(number2);System.out.print(number3);System.out.print(number4);System.out.print(number5);
    }
}
