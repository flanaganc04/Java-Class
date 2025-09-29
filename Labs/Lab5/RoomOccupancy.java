package CS201.Labs.Lab5;
import java.util.Scanner;

public class RoomOccupancy {
    public int numberInRoom = 0; 
    static int totalNumber = 0;

    


            Scanner keyboard = new Scanner(System.in);

    public void addOneToRoom() {
        System.out.println("How many children would you like to add to room number");

        int addOn = keyboard.nextInt();

        if (addOn >= 0) {
            numberInRoom = numberInRoom + addOn;
            totalNumber = totalNumber + addOn;
            System.out.println("The new number in the room is: " + numberInRoom);
              
        }
        else {
            numberInRoom = 0;
        }
    }

    public void removeOneFromRoom() {
        System.out.println("How many children would you like to remove from this room?");

        int takeFrom = keyboard.nextInt();

        if (takeFrom >= 0) {
            numberInRoom = numberInRoom - takeFrom;
            totalNumber = totalNumber - takeFrom;
            System.out.println("The new number in the room is: " + numberInRoom);
            if (numberInRoom <= 0) {
                numberInRoom = 0;
            }
              
        }
        
        }
    

    public void getNumber() {
        if (numberInRoom > 0) {
            System.out.println("The new number in this room is: " + numberInRoom);
        }
    }

    public static int getTotal() {
        return totalNumber;
        }
}


   

