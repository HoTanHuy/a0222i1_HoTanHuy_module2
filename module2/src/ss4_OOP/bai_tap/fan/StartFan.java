package ss4_OOP.bai_tap.fan;


public class StartFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setMaxSpeed();
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setMediumSpeed();
        fan2.setRadius(5);

        System.out.println("Fan1 : "+fan1);
        System.out.println("Fan2 : "+fan2);
    }
}
