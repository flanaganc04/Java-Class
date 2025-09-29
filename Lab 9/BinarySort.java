import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinarySort {

public static void main(String[] args)
    {
        String oldFileName = "C:\\Users\\flana\\OneDrive\\Documents\\Codingness\\Lecture 21\\try.dat";
     try
     {
         ObjectInputStream inputStream = 
               new ObjectInputStream(new FileInputStream(oldFileName));
     }
     catch(FileNotFoundException e)
     {
         System.out.println("Problem opening the file " + oldFileName);
     }
     catch(EOFException e)
     {
         System.out.println("Problem reading the file " + oldFileName);
         System.out.println("Reached end of the file.");
     }
     catch(IOException e)
     {
         System.out.println("Problem reading the file " + oldFileName);
     }
        Objec
        String number = inputStream.writeUTF();
        char[] numbers = number.toCharArray();


        String fileName = "sort.txt"; //The name could be read from 
                                     //the keyboard.
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
        
        for (int count = 0; count <= 7; count++)
        {
            char line = numbers[count];
            outputStream.println(line);
        }
        outputStream.close( );
        System.out.println("Those lines were written to " + 
                            fileName);
    }



}
