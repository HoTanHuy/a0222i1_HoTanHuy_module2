package ss5_access_modifier.bai_tap.circle;

public class Circle {
    private double radius ;
    private String color ;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
}
