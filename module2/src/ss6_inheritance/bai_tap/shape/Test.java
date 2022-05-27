package ss6_inheritance.bai_tap.shape;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
