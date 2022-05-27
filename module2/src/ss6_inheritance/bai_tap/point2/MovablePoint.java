package ss6_inheritance.bai_tap.point2;

public class MovablePoint extends Point2D {
    private double xSpeed,ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(double xSpeed, double ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public double[] getSpeed(){
        double[] arrSpeed = {xSpeed,ySpeed};
        return  arrSpeed;
    }
    public String toString() {
        String res= String.format("(x= %f, y= %f), speed= (xSpeed= %f, xSpeed= %f)",
                getX(), getY(), getXSpeed(), getYSpeed());
        return res;
    }
    public MovablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }

}
