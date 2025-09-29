package CS201.Labs.Lab8;

public class KidDemo {

    public static void main(String[] args) {
        
        SchoolKid jimmy = new SchoolKid();

        jimmy.setAge(12);
        jimmy.setName("Jim");
        jimmy.setGreeting("Hello I am jimmy");
        jimmy.printKid();

        SchoolKid arthur = new SchoolKid(13, "Arthur", "You would not believe your eyes if ten million fireflies, lit up the world as I fell asleep");
        arthur.printKid();

        ExaggeratingKid bill = new ExaggeratingKid(); 
        
        bill.setAge(13);
        System.out.println(bill.getAge());
        bill.printKid();

        ExaggeratingKid henry = new ExaggeratingKid(7, "Henry", "Oh I'm Henry, look at me.");

        henry.printKid();

    }

}
    

