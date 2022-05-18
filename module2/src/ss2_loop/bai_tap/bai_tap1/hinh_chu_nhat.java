package ss2_loop.bai_tap.bai_tap1;

import java.util.Scanner;

public class hinh_chu_nhat {
    public static void main(String[] args) {
        int d;
        int r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input d:");
        d = scanner.nextInt();
        System.out.println("Input r");
        r = scanner.nextInt();
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= d; j++){
                System.out.printf("* ");
            }
            System.out.println("");
        }
    }
}
