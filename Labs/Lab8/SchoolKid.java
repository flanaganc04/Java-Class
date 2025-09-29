package CS201.Labs.Lab8;

public class SchoolKid {
    
    private int age;
    private String name, greeting;

    public SchoolKid() {
        age = 0;
        name = "No name";
        greeting = "No greeting";
    }

    public SchoolKid(int newAge, String newName, String newGreeting) {
        age = newAge;
        name = newName;
        greeting = newGreeting;

    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setGreeting(String newGreeting) {
        greeting = newGreeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void printKid() {
        System.out.println(getAge());
        System.out.println(getName());
        System.out.println(getGreeting());
    }

}
