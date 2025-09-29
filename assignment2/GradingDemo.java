package assignment2;

public class GradingDemo {
    public static void main(String[] args) {
        
        Grades Jeff = new Grades("Jeff", 100,96,9,10);
        
        Jeff.printReport();

        Grades Mandy = new Grades();

        Mandy.setName();
        Mandy.setFinalExam();
        Mandy.setMidtermExam();
        Mandy.setQuiz1();
        Mandy.setQuiz2();
        Mandy.printReport();
        

    }
}
