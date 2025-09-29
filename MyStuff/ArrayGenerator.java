package CS201.MyStuff;
import java.util.Scanner;

public class ArrayGenerator 
{
    private int amount;
    String[] newArray = new String[amount];
    Scanner keyboard = new Scanner(System.in);

    public ArrayGenerator() {
        amount = 0;
        
    }

    public void increaseAmountByOne() {
        amount = amount +1;
    }

    public void setIndex(int index) {
        System.out.println("You have selcted index " + index + " you will now enter the value for that index");
        newArray[index] = keyboard.nextLine();
    }

    public void printAmount() {
        System.out.println(amount);
    }

    public void printArray() {
System.out.println(newArray);
    }

    public static void main(String[] args) {
        ArrayGenerator array1 = new ArrayGenerator();
        array1.increaseAmountByOne();
        
        array1.printAmount();
        array1.setIndex(1);


        array1.printArray();
    }
}


