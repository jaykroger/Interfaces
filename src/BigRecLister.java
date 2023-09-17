import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRecLister
{
    public static void main(String[] args)
    {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        // Rectangles construcion and adding to ArrayList;

        // Perimeter over 10
        Rectangle r1 = new Rectangle();
        r1.height = 2;
        r1.width = 4;
        rectangles.add(r1);

        // Perimeter over 10
        Rectangle r2 = new Rectangle();
        r2.height = 3;
        r2.width = 4;
        rectangles.add(r2);

        // Perimeter under 10
        Rectangle r3 = new Rectangle();
        r3.height = 1;
        r3.width = 2;
        rectangles.add(r3);

        // Perimeter under 10
        Rectangle r4 = new Rectangle();
        r4.height = 1;
        r4.width = 2;
        rectangles.add(r4);

        // Perimeter under 10
        Rectangle r5 = new Rectangle();
        r5.height = 1;
        r5.width = 3;
        rectangles.add(r5);

        // Perimeter under 10
        Rectangle r6 = new Rectangle();
        r6.height = 2;
        r6.width = 2;
        rectangles.add(r6);

        // Perimeter under 10
        Rectangle r7 = new Rectangle();
        r7.height = 1;
        r7.width = 1;
        rectangles.add(r7);

        // Perimeter over 10
        Rectangle r8 = new Rectangle();
        r8.height = 4;
        r8.width = 6;
        rectangles.add(r8);

        // Perimeter over 10
        Rectangle r9 = new Rectangle();
        r9.height = 5;
        r9.width = 6;
        rectangles.add(r9);

        // Perimeter over 10
        Rectangle r10 = new Rectangle();
        r10.height = 5;
        r10.width = 7;
        rectangles.add(r10);

        Filter recFilter = new BigRectangleFilter();
        ArrayList<Rectangle> acceptedRectangles = new ArrayList<>();

        for (Rectangle r : rectangles)
        {
            if (recFilter.accept(r))
            {
                acceptedRectangles.add(r);
            }
        }
        collectAll(acceptedRectangles);
    }

    public static void collectAll(ArrayList<Rectangle> array)
    {
        for (Rectangle obj : array) {
            System.out.println(obj);
        }
    }
}
