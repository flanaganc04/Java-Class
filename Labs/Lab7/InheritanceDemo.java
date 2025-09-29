package CS201.Labs.Lab7;

public class InheritanceDemo {
    public static void main(String[] args) {
        
        Person john = new Person("John");
        Person beth = new Person();

        beth.setName("Beth");

        System.out.println("Name: " + beth.getName());

        john.writeOutput();
        


        Employee warren = new Employee();
        warren.setName("Warren");
        warren.setSalary(70000);
        warren.writeOutput();

        Employee warren2 = new Employee("Warren", 1000000, 1843, "315-94-2121");

        warren2.writeOutput();
        

        Employee jess = new Employee("Jessica", 1000000, 1999, "212-69-6948");
        jess.writeOutput();
        

       



    }
}
