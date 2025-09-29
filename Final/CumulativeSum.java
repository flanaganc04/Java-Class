import java.util.Scanner;

public class CumulativeSum {
    
    // These are just variable declarations
    // I was struggling to allow the user to set the length of the array through the terminal, but i got it
    private int sum, length;
    private int[] anArray, cumulativeSumArray;;
    private int counter = 0;

    // Here is my recursive method
    public void cumSum() {
        if(counter > length - 1) {
            mendedArray();
        }
        else{
            mendSum();
            mendArray();
            increaseCounter();
            cumSum();
        }
    }

    // Method to set the length, used in Set array
     public void setLength() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the length of the array you would like");
        int leng = keyboard.nextInt();
        anArray = new int[leng];
        cumulativeSumArray = new int[leng];
        length = anArray.length;
     }

    // Method to set the values in an array
    public void setArray() {
        Scanner keyboard = new Scanner(System.in);
        
        setLength();

        System.out.println("On each line enter the value you would like to add to the array: ");
        
        for(int i = 0; i < anArray.length; i++) {
            anArray[i] = keyboard.nextInt();
        }
    }

    public void increaseCounter() {
        counter += 1;
    }

    // unused
    public int getCounter() {
        return counter;
    }

    public void mendSum() {
        sum += anArray[counter];
    }

    // unused
    public int mendedSum() {
        return sum;
    }

    public void mendArray() {
        cumulativeSumArray[counter] = sum;
    }

    // This is a method to print the arrays to strings
    public void mendedArray() {
        int i;
        String array = "{";
        for(i = 0; i < cumulativeSumArray.length - 1; i++) {
            array = array + cumulativeSumArray[i] + ",";
        }
        array = array + cumulativeSumArray[i] + "}";

        String ogArray = "{";
        for(i = 0; i < anArray.length - 1; i++) {
            ogArray = ogArray + anArray[i] + ",";
        }
        ogArray = ogArray + anArray[i] + "}";

        System.out.println("The original array was " + ogArray);
        System.out.println("The array as a cumulative sum of all the values in the original array was " + array);
    }

    public static void main(String[] args) {
        CumulativeSum firstArray = new CumulativeSum();
        
        firstArray.setArray();
        firstArray.cumSum();
    }
}

