package CS201.Labs.Lab8;

public class CalculatorDemo {
    
    public static void main(String[] args) {
        RegularPay jim = new RegularPay();

        System.out.println("Jim");
        jim.setPayRate(15);
        jim.setHours(40);
        jim.printPay();

        RegularPay bob = new RegularPay(15,40);
        System.out.println("Bob");
        bob.printPay();

        HazardPay tom = new HazardPay();
        tom.setPayRate(15);
        tom.setHours(40);

        System.out.println("Tom");
        tom.printPay();

        HazardPay jerry = new HazardPay(15, 40);
        System.out.println("Jerry");
        jerry.printPay();
    }
}
