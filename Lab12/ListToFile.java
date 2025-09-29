import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListToFile {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> sentence = new ArrayList<ArrayList<String>>();
        String fileName = "file.txt";
        Scanner inputStream = null;
        				   
       try
       {
           inputStream = new Scanner(new File(fileName));
       }
       catch(FileNotFoundException e)
       {
           System.out.println("Error opening the file " + 
                               fileName);
           System.exit(0);
       }
	   
       while (inputStream.hasNextLine())
       {
           String line = inputStream.nextLine();
           ArrayList<String> wordsInLine = new ArrayList<String>();

           sentence.add(wordsInLine);
           Scanner lineScanner = new Scanner(line);
           
           
       }
       inputStream.close();
    }
}
