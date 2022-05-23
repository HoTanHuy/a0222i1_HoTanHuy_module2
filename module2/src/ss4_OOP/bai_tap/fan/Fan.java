package ss4_OOP.bai_tap.fan;

public class Fan {
    private final int SLOW = 1, MEDIUM =2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public void setMaxSpeed(){
        this.speed = this.FAST;
    }
    public void setMediumSpeed(){
        this.speed = this.MEDIUM;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

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

    public String toString(){
        return this.isOn()? String.format("Speed: %d, Color: %s, Radius: %.1f. Fan is On",speed,color,radius):
                String.format("Color: %s, Radius: %.1f. Fan is Off",color,radius);
    }


}
