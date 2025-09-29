package CS201.Demos.Lecture13;

public class DollarFormatFirstTry
{
    /**
    Displays amount in dollars and cents notation.
    Rounds after two decimal places.
    Does not advance to the next line after output.
    */
    public static void write (double amount)
    {
        int allCents = (int) (Math.round (amount * 100));
        int dollars = allCents / 100;                    
        int cents = allCents % 100;                      
        System.out.print ('$');
        System.out.print (dollars);
        System.out.print ('.');
        if (cents < 10)              
        {                            
            System.out.print ('0');  
            System.out.print (cents);
        }                            
        else                         
            System.out.print (cents);
    }


    /**
    Displays amount in dollars and cents notation.
    Rounds after two decimal places.
    Advances to the next line after output.
    */
    public static void writeln (double amount)
    {
        write (amount);
        System.out.println ();
    }
}
