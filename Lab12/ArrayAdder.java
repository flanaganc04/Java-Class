import java.util.Scanner;
import java.util.Arrays;
public class ArrayAdder
{
    public static void main (String [] args)
    {
        int [] numbers = new int [5];
        int [] cumSum = new int [5];
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Enter 5 numbers:");
        int sum = 0;
        for (int index = 0 ; index < 5 ; index++)
        {
            numbers [index] = keyboard.nextInt ();
            cumSum[index] =numbers [index];
            sum = sum + numbers [index];
        }
        System.out.println ("The sum is iteratively: " + sum);
        
        int sumRec = sumArray(numbers);

        System.out.println ("The sum using recursion: " + sumRec);

        
        cumulativeSum(cumSum);
        // for (int index = 0 ; index < 5 ; index++)
        // {
        //     System.out.println ("The element: "+ index + " is " + cumSum[index]);
        // }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(cumSum));

        System.out.println ("Have a nice week.");
    }

    public static int sumArray(int [] data){
        return sumArray(data, data.length-1);
    }
    
    public static int sumArray(int [] data, int last){
        int result;
        
        if(last < 0)
            result = 0;   // only one value in the subarray
        else{
            result = data[last] + sumArray(data, last-1);
        }
        
        return result;
        
    }

    public static void cumulativeSum(int data[]){
        cumulativeSum(data, 1);
    }
    
    public static void cumulativeSum(int data[], int n) {
        if (n == data.length)
            return;
        else {
            data[n] += data[n-1];
            cumulativeSum(data, n+1);
        }
    }


}
