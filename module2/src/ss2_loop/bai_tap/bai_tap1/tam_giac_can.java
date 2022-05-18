package ss2_loop.bai_tap.bai_tap1;

import java.util.Scanner;

public class tam_giac_can {
    public static void main(String[] args) {
        int h;
        int m;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input h: ");
        h = scanner.nextInt();
        m=h;
        n=h;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= 2*h ; j++) {
                if (j>=m && j<=n){
                    System.out.printf("*");
                }else {
                    System.out.printf(" ");
                }
            }
            m--;
            n++;
            System.out.println("");
        }
        
    }
}
