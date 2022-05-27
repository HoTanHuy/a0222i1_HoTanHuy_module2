package ss6_inheritance.bai_tap.point;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        System.out.println(Arrays.toString(point2D.getXY()));
        Point3D point3D = new Point3D(3,4,5);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }

}
