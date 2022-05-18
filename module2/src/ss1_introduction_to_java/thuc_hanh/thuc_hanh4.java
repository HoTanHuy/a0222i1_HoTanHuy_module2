package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class thuc_hanh4 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        double a = scanner.nextDouble();
        System.out.println("Input b:");
        double b = scanner.nextDouble();
        System.out.println("Input c:");
        double c = scanner.nextDouble();
        if (a == 0){
            if (b==c){
                System.out.println("VSN");
            }else {
                System.out.println("VN");
            }
        }else {
            double x = (c-b)/a;
            System.out.println("x = "+x);
        }

    }
}
