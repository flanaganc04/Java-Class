package CS201.Assignments.Exam1.Problem4;

public class ScienceFairProjectRating 
{   
    static int judges = 0, maxScore = 100;
    public String nameJudge, nameProject, ID;
    public int 
                creativity,
                scientific,
                thoroughness,
                technical,
                clarity,
                total;

    public ScienceFairProjectRating() 
    {
        nameJudge = " null";
        nameProject = " null";
        ID = " null";
        judges++;
        creativity = 0;
        scientific = 0;
        thoroughness = 0;
        technical = 0;
        clarity = 0;
    }

    public void displayRatings() 
    {
        System.out.println( "The name of the judge is" + nameJudge);
        System.out.println("The name of this project is" + nameProject);
        System.out.println("The ID  for this project number is" + ID);
        System.out.println("The score for creativity out of 30 is " + creativity);
        System.out.println("The score for scientific thought out of 30 is " + scientific);
        System.out.println("The score for thoroughness out of 15 is " + thoroughness);
        System.out.println("The score for technicality out of 15 is " + technical);
        System.out.println("The score for clarity out of 10 is " + clarity);
        total = creativity + scientific + thoroughness + technical + clarity;
        System.out.println("The total score for this project is " + total + " out of " + maxScore);
        System.out.println();
    }

    public void displayScore() 
    {
        total = creativity + scientific + thoroughness + technical + clarity;
        System.out.println("The total score for this project is " + total + " out of " + maxScore);
    }

    static void maxScore() 
    {
        System.out.println(maxScore);
    }

    public void setCreativity(int newcreativity) 
    {
        
        if (newcreativity > 30) 
        {
            creativity = 30;
        }
        else 
        {
            creativity = newcreativity;
        }

    }

    public int getCreativity() 
    {
        return creativity;
    }

    public void displayCreativity(String rating) 
    {
        System.out.println("The creativity for this project is " + getCreativity());
    }

    public void setScientific(int newscientific) 
    {
        
        if (newscientific > 30) 
        {
            scientific = 30;
        }
        else 
        {
            scientific = newscientific;
        }
    }

    public int getScientific() 
    {
        return scientific;
    }
    public void displayScientific(String rating) 
    {
        System.out.println("The level of scientific thought for this project is " + getScientific());
    }

    public void setThoroughness(int newthoroughness) 
    {
        
        if (newthoroughness > 15) 
        {
            thoroughness = 15;
        }
        else 
        {
            thoroughness = newthoroughness;
        }
    }

    public int getThoroughness() 
    {
        return thoroughness;
    }

    public void displayThoroughness(String rating) 
    {
        System.out.println("The thoroughness for this project is " + getThoroughness());
    }

    public void setTechnicality(int newTechnicality) 
    {
        
        if (newTechnicality > 15) 
        {
            technical = 15;
        }
        else 
        {
            technical = newTechnicality;
        }
    }

    public int getTechnicality() 
    {
        return technical;
    }

    public void displayTechnicality(String rating) 
    {
        System.out.println("The creativity for this project is " + getTechnicality());
    }

    public void setClarity(int newclarity) 
    {
        if (newclarity > 10) 
        {
            clarity = 10;
        }
        else 
        {
            clarity = newclarity;
        }
    }

    public int getClarity() {
        return clarity;
    }
    public void displayClarity(String rating) 
    {
        System.out.println("The creativity for this project is " + getClarity());
    }

    static int getJudges() 
    {
        return judges;
    }

    static void displayJudges() 
    {
        System.out.println("The total number of judges/judgements that have been made so far are " + judges);
    }
}

