package assignment2;
import java.util.Scanner;
public class StudentRecord {
    private String name;
    Scanner keyboard = new Scanner(System.in);

    public StudentRecord () {
        name = "No Name";
    }

    public StudentRecord(String intName) {
        name = intName;
    }

    public void setName() {
        System.out.println("Please enter the name of the Student:");
        name = keyboard.nextLine();
    }

    public String getName() {
        return name;
    }
}
