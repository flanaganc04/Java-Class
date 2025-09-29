package CS201.Demos.Lecture8;

public class ForDemo
{   
    public static void main (String [] args)
    {
        int countDown;
        // int fact = 1;
        for (countDown = 10 ; countDown >= 0 ; countDown--)
        {
            System.out.println (countDown);
            System.out.println ("and counting.");
            // fact *= countDown;
        }
        System.out.println ("Blast off!");
    }
}
