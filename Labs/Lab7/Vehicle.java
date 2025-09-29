package CS201.Labs.Lab7;

public class Vehicle {
    
private String manufacturer;
private int cylinders;
private Person owner;

Person defaultPerson = new Person("No name of owner");

public Vehicle() {
    manufacturer = "None reported";
    cylinders = 0;
    owner = defaultPerson;
}

public void writeOutput() {
    System.out.println("The manufacturer's name is" + manufacturer);
    System.out.println("The number of cyclinders is " + cylinders);
    System.out.println(manufacturer);
}
}
