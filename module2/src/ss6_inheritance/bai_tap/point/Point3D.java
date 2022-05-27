package ss6_inheritance.bai_tap.point;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(double z) {
        this.z = z;
    }

    public Point3D() {
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ(double x,double y,double z){
        setXY(x,y);
        this.z=z;
    }
    public double[] getXYZ(){
        double[] arr3D = {getX(),getY(),z};
        return arr3D;
    }
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                "y=" + getY() +
                "z=" + z +
                '}';
    }
}
