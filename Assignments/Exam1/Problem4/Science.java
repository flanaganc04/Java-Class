package CS201.Assignments.Exam1.Problem4;

public class Science {
    public static void main(String[] args) {


        ScienceFairProjectRating.maxScore();
        ScienceFairProjectRating project1 = new ScienceFairProjectRating();
        project1.displayRatings();

        ScienceFairProjectRating.displayJudges();

        ScienceFairProjectRating project2 = new ScienceFairProjectRating();
        project2.setCreativity(25);
        project2.setScientific(30);
        project2.setThoroughness(14);
        project2.setTechnicality(15);
        project2.setClarity(7);
        project2.displayCreativity(null);
        project2.displayScientific(null);
        project2.displayThoroughness(null);
        project2.displayTechnicality(null);
        project2.displayClarity(null);
        project2.displayScore();
        System.out.println("");
        project2.displayRatings();

        ScienceFairProjectRating.displayJudges();
    }
}
