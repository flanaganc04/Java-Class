import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class StorePurchases {

    public static void main(String[] args)
    {
        String fileName = "C:\\Users\\flana\\OneDrive\\Documents\\Codingness\\Lab 9\\out.txt"; //The name could be read from 
                                     //the keyboard.

         String[] ary = new String[3];                              
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(fileName);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening the file " + 
                                fileName);
            System.exit(0);
        }
		
        System.out.println("Enter three lines of text:");
        Scanner keyboard = new Scanner(System.in);
        for (int count = 1; count <= 3; count++)
        {
            ary[count - 1] = keyboard.nextLine();
            outputStream.print(ary[count - 1] + ",");
        }
        outputStream.println();
        outputStream.close( );
        System.out.println("Those lines were written to " + 
                            fileName);



        try
        {
            Scanner inputStream = new Scanner("C:\\Users\\flana\\OneDrive\\Documents\\Codingness\\Lab 9\\out.txt");
            // Read the header line
            String line = inputStream.nextLine();
			// Total sales
            double total = 0;
            // Read the rest of the file line by line
            while (inputStream.hasNextLine())
            {
				// Contains SKU,Quantity,Price,Description
				line = inputStream.nextLine();
				// Turn the string into an array of strings
				ary = line.split(",");
				// Extract each item
				String SKU = ary[0];
				int quantity = Integer.parseInt(ary[1]);
				double price = Double.parseDouble(ary[2]);
				
				// Output item
				System.out.printf("Sold %d of %s (SKU: %s) at $%1.2f each.\n",
					quantity, SKU, price);

                System.out.print(ary);
				// Compute total
				total = quantity * price;
			}
			System.out.printf("Total sales: $%1.2f\n",total);
            inputStream.close( );
        }
        
        catch(Exception e)
        {
            System.out.println("Problem with input from file " + fileName);
        }
    }
    
}
