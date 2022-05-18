package ss2_loop.bai_tap.bai_tap1;

import java.util.Scanner;

public class tam_giac_vuong {
    public static void main(String[] args) {
        int h;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input h: ");
        h = scanner.nextInt();
        for (int i = 1; i <= h ; i++) {
           for (int j=1; j<=i;j++){
               System.out.printf("* ");
           }
            System.out.println("");
        }
    }
}
