package ss6_inheritance.bai_tap.point2;

public class Point2D {
    private double x,y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double[] getXY(){
        double[]arr2D = {x,y};
        return arr2D;
    }
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
