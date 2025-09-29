package CS201.Labs.Lab8;

public abstract class PayCalculator {
    
    private double payRate, hours;

    public PayCalculator() {
        payRate = 0;
        hours = 0;
    }

    public PayCalculator(double newPay, double newHours){
        payRate = newPay;
        hours = newHours;
    }
    public void setPayRate(double newRate) {
        payRate = newRate;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setHours(double newHours) {
        hours = newHours;
    }

    public double getHours() {
        return hours;
    }

    public double calculatePay() {
        return getPayRate()*getHours();
    }

    public void printPay() {
        System.out.println("At a rate of " + getPayRate() + " dollars per hour");
        System.out.println("And with " + getHours() + " hours worked");
        System.out.println("This person's pay for this period will be:");
        System.out.println("$" + calculatePay()); 
        System.out.println("");
    }
}
