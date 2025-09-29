package CS201.Labs.Lab3;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        String hiddenNumber, GuessNumber;
        int sumGuess = 0, countCorrect = 0;
        hiddenNumber = "34567";
            char g0;
            char h0;
            char g1;
            char h1;
            char g2;
            char h2;
            char g3;
            char h3;
            char g4;
            char h4;
        System.out.println("Guess your five digit number");
        try (Scanner keyboard = new Scanner(System.in)) {
            GuessNumber = keyboard.next();
        }
        g0 = GuessNumber.charAt(0);
        h0 = hiddenNumber.charAt(0);
        g1 = GuessNumber.charAt(1);
        h1 = hiddenNumber.charAt(1);
        g2 = GuessNumber.charAt(2);
        h2 = hiddenNumber.charAt(2);
        g3 = GuessNumber.charAt(3);
        h3 = hiddenNumber.charAt(3);
        g4 = GuessNumber.charAt(4);
        h4 = hiddenNumber.charAt(4);

        if (CharComparison.compare(g0, h0)) {
            countCorrect += 1;
            sumGuess += Character.getNumericValue(g0);
        }
        if (CharComparison.compare(g1, h1)) {
            countCorrect += 1;
            sumGuess += Character.getNumericValue(g1);
        }
        if (CharComparison.compare(g2, h2)) {
            countCorrect += 1;
            sumGuess += Character.getNumericValue(g2);
        }
        if (CharComparison.compare(g3, h3)) {
            countCorrect += 1;
            sumGuess += Character.getNumericValue(g3);
        }
        if (CharComparison.compare(g4, h4)) {
            countCorrect += 1;
            sumGuess += Character.getNumericValue(g4);
        }
        System.out.println(countCorrect);
        System.out.println(sumGuess);
    }
    public class CharComparison {
        static public boolean compare(char A, char B) {
            if (A==B) {
                return true;
            }
            else {
                return false;
            }
        }


    }

}


