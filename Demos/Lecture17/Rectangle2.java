package CS201.Demos.Lecture17;


/**
 Class for drawing rectangles on the screen using keyboard
 characters. Each character is higher than it is wide, so
 these rectangles will look taller than you might expect.
 Inherits getOffset, setOffset, and drawAt from the class
 ShapeBasics.
*/
public class Rectangle2 extends ShapeBasics implements RectangleInterface
{
    private int height;
    private int width;
    
    public Rectangle2( )
    {
        super( );
        height = 0;
        width = 0;
    }
    
    public Rectangle2(int theOffset, int theHeight, int theWidth)
    {
        super(theOffset);
        height = theHeight;
        width = theWidth;
    }
    
    public void set(int newHeight, int newWidth)
    {
        height = newHeight;
        width = newWidth;
    }
    
    /**
     Draws the shape at the current line.
    */
    public void drawHere( )
    {
        drawHorizontalLine( );
        drawSides( );
        drawHorizontalLine( );
    }

    private void drawHorizontalLine( )
    {
        skipSpaces(getOffset( )); 
        for (int count = 0; count < width; count++)
             System.out.print('-');
        System.out.println( );        
    }
    
    private void drawSides( )
    {
        for (int count = 0; count < (height - 2); count++)
            drawOneLineOfSides( );
    }
    
    private void drawOneLineOfSides( )
    {
        skipSpaces(getOffset( )); 
        System.out.print('|');
        skipSpaces(width - 2);        
        System.out.println('|');
    }
    
    //Writes the indicated number of spaces.
    private static void skipSpaces(int number)
    {
        for (int count = 0; count < number; count++)
            System.out.print(' ');
    }
}




