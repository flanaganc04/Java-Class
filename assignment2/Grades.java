package assignment2;
import java.util.Scanner;

public class Grades extends StudentRecord {
    
    private int finalExam, midterm, quiz1, quiz2;
    private String finalLetterGrade;
    Scanner keyboard = new Scanner(System.in);

    public Grades() {
        super();
        finalExam = 0;
        midterm = 0;
        quiz1 = 0;
        quiz2 = 0;
        finalLetterGrade = " ";
    }

    public Grades(String intName) {
        super(intName);
        finalExam = 0;
        midterm = 0;
        quiz1 = 0;
        quiz2 = 0;
        finalLetterGrade = " ";
    }

    public Grades(String intName, int finalExamTemp, int midtermTemp, int quiz1Temp, int quiz2Temp) {
        super(intName);
        if (finalExamTemp <= 0) {
            finalExam = 0;
        }
        else {
            finalExam = finalExamTemp;
        }

        if (midtermTemp <= 0) {
            midterm = 0;
        }
        else {
            midterm = midtermTemp;
        }

        if (quiz1Temp <= 0) {
            quiz1 = 0;
        }
        else {
            quiz1 = quiz1Temp;
        }

        if (quiz2Temp <= 0) {
            quiz2 = 0;
        }
        else {
            quiz2 = quiz2Temp;
        }

        
    }

    

    public void setFinalExam() {
        System.out.println("You would like to set the grade for the final exam out of 100 points");
        System.out.println("Enter an integer here:");

        int grade = keyboard.nextInt();
        if (grade < 0) {
            finalExam = 0;
        }
        else {
            finalExam = grade;
        }
    }


    public void setMidtermExam() {
        System.out.println("You would like to set the grade for the midterm exam out of 100 points");
        System.out.println("Enter an integer here:");

        int grade = keyboard.nextInt();
        if (grade <= 0) {
            midterm = 0;
        }
        else {
            midterm = grade;
        }

    }


    public void setQuiz1() {
        System.out.println("You would like to set the grade for the first quiz out of 10 points");
        System.out.println("Enter an integer here:");

        int grade = keyboard.nextInt();
        if (grade < 0) {
            quiz1 = 0;
        }
        else {
            quiz1 = grade;
        }

    }

    
    public void setQuiz2() {
        System.out.println("You would like to set the grade for the second quiz out of 10 points");
        System.out.println("Enter an integer here:");
        int grade = keyboard.nextInt();
        if (grade < 0) {
            quiz2 = 0;
        }
        else {
            quiz2 = grade;
        }

    }

    public int getFinalExam() {
        return finalExam;
    }
    public int getMidterm() {
        return midterm;
    }
    public int getQuiz1() {
        return quiz1;
    }
    public int getQuiz2() {
        return quiz2;
    }

    public double normalizedMidterm() {
        return getMidterm() / (double) 2;
    }

    public double normalizedQuiz1() {
        return getQuiz1() * 2.5;
    }

    public double normalizedQuiz2() {
        return getQuiz2() * 2.5;
    }

    public double calcOverallGrade() {
        return (getFinalExam() + normalizedMidterm() + normalizedQuiz1() + normalizedQuiz2())/(double) 200;
    }

    public void setLetterGrade() {
        // double grade = (double) calcOverallGrade();
        if (calcOverallGrade()>1)
            finalLetterGrade = "Not allowed value";
        else if (calcOverallGrade() >= 0.9)
            finalLetterGrade = "A";
        else if (calcOverallGrade() >= 0.8)
            finalLetterGrade = "B";
        else if (calcOverallGrade() >= 0.7)
            finalLetterGrade = "C";
        else if (calcOverallGrade() >= 0.6)
            finalLetterGrade = "D";
        else
            finalLetterGrade = "F";
    }

    public String getFinalLetterGrade() {
        return finalLetterGrade;
    }


    public String roundOverallGrade() {
        return String.format("%.2f", calcOverallGrade()*100);
    }
    
    public void printReport() {
        this.setLetterGrade();
        System.out.println("Here is the report for " + getName());
        System.out.println("The overall numerical grade is: " + roundOverallGrade() + "%");
        System.out.println("The final letter grade is a(n) " + getFinalLetterGrade());
    }
}
