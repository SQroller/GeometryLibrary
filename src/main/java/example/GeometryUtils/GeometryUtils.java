package example.GeometryUtils;

import example.Figures.Circle;
import example.Figures.Rectangle;
import example.Figures.Triangle;

public class GeometryUtils {
    public static boolean CircleEquals(Circle c1, Circle c2) {
        return c1.getRadius() == c2.getRadius();
    }

    public static boolean RectangleEquals(Rectangle r1, Rectangle r2) {
        return (r1.getA == r2.getA && r1.getB == r2.getB) || (r1.getA == r2.getB && r1.getB == r2.getA);
    }

    public static boolean TriangleEquals(Triangle t1, Triangle t2) {
        double[] arrayA = new double[3] {
            t1.getA, t1.getB, t1.getC
        } ;

        double[] arrayB = new double[3] {
            t2.getA, t2.getB, t2.getC
        } ;

        Collections.sort(arrayA);
        Collections.sort(arrayB);
        int i = 0;
        while(i<3) {
            if(arrayA[i] != arrayB[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
