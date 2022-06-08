package ss7_abstract_class_interface.bai_tap.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Resizeable[] resizeable= new Resizeable[3];
        resizeable[0]= new Circle(5, "red", true);
        resizeable[1]= new Rectangle(5, 9, "yellow", false);
        resizeable[2]= new Square(15,"blue", false);

        for (Resizeable e: resizeable){
            if(e instanceof Circle){
                e.resize(50);
                System.out.println(e);
            }else if(e instanceof Rectangle){
                e.resize(50);
                System.out.println(e);
            }else if(e instanceof Square){
                e.resize(50);
                System.out.println(e);
            }
        }
    }
}
