package ss6_inheritance.bai_tap.point2;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,5);
        System.out.println(point2D);
        MovablePoint movablePoint = new MovablePoint(2,5,7,9);
        System.out.println(movablePoint.move());
    }
}
