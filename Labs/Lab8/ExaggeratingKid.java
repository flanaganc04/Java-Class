package CS201.Labs.Lab8;

public class ExaggeratingKid extends SchoolKid {

    
    public ExaggeratingKid() {
        super();
    }

    public ExaggeratingKid(int newAge, String newName, String newGreeting) {
        super(newAge + 2, newName, newGreeting + " I am the best!");
         
        
    }

    public void setAge(int newAge) {
        int exAge = newAge + 2;
        super.setAge(exAge);
    
    }


    public void setGreeting(String newGreeting) {
        String exGreeting = newGreeting + " I am the Best!";
        super.setGreeting(exGreeting);
    }


}
