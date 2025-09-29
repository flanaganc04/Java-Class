package CS201.Labs.Lab7;

public class Employee extends Person {
    
    private double salary;
    private int yearHired;
    private String SSN;

    public Employee() {
        super();
        salary = 0;
        yearHired = 0;
        SSN = "No SSN available";
    }

    public Employee(String initialName, double initialSalary, int initialYearHired, String initialSSN) {
        super(initialName);
        salary = initialSalary;

        if (initialYearHired > 2024) {
            yearHired = 2024;
        }
        if (initialYearHired < 1920) {
            yearHired = 1920;
        }
        else {
            yearHired = initialYearHired;
        }

        SSN = initialSSN;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearHired() {
        return yearHired;
    }

    public void setSSN(String newidNumber) {
        SSN = newidNumber;
    }

    public String getSSN() {
        return SSN;
    }

    public void writeOutput() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: $" + getSalary());
        System.out.println("Year Hired: " + getYearHired());
        System.out.println("ID Number: " + getSSN());
        System.out.println();
    }

    public boolean hasSameSalary(Employee  otherPerson) {
        if (salary == otherPerson.getSalary()) {
            return true;
        }
        else {
            return false;
        }
    }
}
