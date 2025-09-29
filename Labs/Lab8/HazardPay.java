package CS201.Labs.Lab8;

public class HazardPay extends PayCalculator {

    public HazardPay() {
    }

    public HazardPay(double newPay, double newHours) {
        super(newPay, newHours);
    }

    public double computePay() {
        return(getPayRate()*getHours())*1.5;
    }

    public void printPay() {
        System.out.println("At a hazard rate of " + getPayRate() + " dollars per hour");
        System.out.println("And with " + getHours() + " hours worked");
        System.out.println("Your pay for this period will be $" + computePay());
        System.out.println("");
    }
}
