package CS201.Labs.Lab3;
import java.util.Scanner;
public class IntegerList {
    
   
    public static void main(String[] args) {
        
        double average;
        int sum, counter, next;
        int largest = 0;
        int smallest = 0;
        String answer;

        Scanner keyboard = new Scanner(System.in);

       do {
            sum = 0;
            counter = 0;
            next = keyboard.nextInt();
            while ( next >= 0 ) {
                sum = sum + next;
                counter ++;
            if (next > largest) 
            {
                largest = next;
            }
            if (next < smallest & next >= 0) 
            {
                smallest = next;
            }
            else 
        
                System.out.println("Need to put something here");
                answer = keyboard.next();
            }
            
        }
        while (answer.equalsIgnoreCase("yes"));

        average = sum/counter;
        System.out.println(average);
        System.out.println(sum);
        System.out.println(counter);
}
}

             
        
