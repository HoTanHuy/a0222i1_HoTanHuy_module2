package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class thuc_hanh3 {
    public static void main(String[] args) {
        float d;
        float r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input d: ");
        d = scanner.nextFloat();
        System.out.println("Input r: ");
        r = scanner.nextFloat();
        float DT = d*r;
        System.out.println("DT = "+DT);
        float CV = (d+r)*2;
        System.out.println("CV = "+CV);
    }
}
