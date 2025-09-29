package CS201.Labs.Lab7;

public class Person {
    
    private String name;

    public Person() {
        name = "None available";
    }

    public Person(String initialName) {
        name = initialName;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println();
    }

    public boolean hasSameName(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}
