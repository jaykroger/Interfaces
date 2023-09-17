import java.awt.Rectangle;

public class BigRectangleFilter implements Filter
{

    @Override
    public boolean accept(Object x)
    {
        boolean isAccepted = false;

        Rectangle r = (Rectangle) x;
        int recPerimeter = (2 * r.height) + (2 * r.width);

        if (recPerimeter > 10)
        {
            isAccepted = true;
        }
        return isAccepted;
    }
}
