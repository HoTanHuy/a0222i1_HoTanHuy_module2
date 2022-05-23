package ss4_OOP.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public void setA(double a){
        this.a=a;
    }
    public double getA(){
        return this.a;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return this.b;
    }
    public void setC(double c){
        this.c=c;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(double a, double b , double c){
        double delta = b*2 - 4*a*c;
        return delta;
    }
    public double getRoot1(double a, double b , double c){
        double r1 =((-b)+Math.sqrt(b*b-4*a*c))/2*a;
        return r1;
    }
    public double getRoot2(double a, double b , double c){
        double r2 =((-b)-Math.sqrt(b*b-4*a*c))/2*a;
        return r2;
    }

    public static void main(String[] args) {
        double a,b,c;
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input a,b,c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        //System.out.println("a= "+quadraticEquation.getA());
        double delta = quadraticEquation.getDiscriminant(a,b,c);
        if (delta<0){
            System.out.println("The equation has no real root");
        }else if (delta==0){
            double r = quadraticEquation.getRoot1(a,b,c);
            System.out.println("The equation has one root "+r);
        }else {
            double r1, r2;
            r1 = quadraticEquation.getRoot1(a,b,c);
            r2 = quadraticEquation.getRoot2(a,b,c);
            System.out.println("The equation has two roots "+r1+" and "+r2);
        }
    }
}
