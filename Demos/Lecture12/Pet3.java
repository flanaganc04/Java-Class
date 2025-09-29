package CS201.Demos.Lecture12;

/**
Revised class for basic pet data: name, age, and weight.
need to define set method
*/
public class Pet3
{
    private String name;
    private int age; //in years
    private double weight; //in pounds

    public Pet3 (String initialName, int initialAge,
            double initialWeight)
    {
        set (initialName, initialAge, initialWeight);
    }


    public Pet3 (String initialName)
    {
        this (initialName, 0, 0);
    }


    public Pet3 (int initialAge)
    {
        this ("No name yet.", initialAge, 0);
    }


    public Pet3 (double initialWeight)
    {
        this ("No name yet.", 0, initialWeight);
    }


    public Pet3 ()
    {
        this ("No name yet.", 0, 0);
    }


    /*  The rest of the class is like Pet2  */
}
