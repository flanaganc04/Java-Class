package CS201.Labs.Lab5;

public class RoomTest {
    public static void main (String [] args) {

        

        System.out.println("The goal of this program is to be able to let you add, remove, find the number in one room, and the number total of chilren in a school or building. The program will allow you to create rooms. It will then prompt you how many do you want to add, or remove, then it will display the number in that room and the total.");

        RoomOccupancy RoomName = new RoomOccupancy();
        RoomName.numberInRoom = 0;
        RoomName.addOneToRoom();
        RoomName.removeOneFromRoom();
        RoomName.getNumber();
        RoomOccupancy.getTotal();

        RoomOccupancy Room1 = new RoomOccupancy();
        Room1.numberInRoom = 0;
        Room1.addOneToRoom();
        Room1.removeOneFromRoom();
        Room1.getNumber();
        RoomOccupancy.getTotal();
    }
    
}
