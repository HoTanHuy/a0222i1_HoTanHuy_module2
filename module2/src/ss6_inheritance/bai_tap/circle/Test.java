package ss6_inheritance.bai_tap.circle;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.0,"blue",5.0);
        Circle circle = new Circle();
        System.out.println(circle.toString());

        System.out.println(cylinder.toString());
        System.out.println("Radius of cylinder = " + cylinder.getRadius() + ", "+
                "Height of cylinder = "+ cylinder.getHeight()+", "+
                "Color of cylinder: "+cylinder.getColor()+", "+
                "Volume = "+cylinder.getVolume());
    }
}
