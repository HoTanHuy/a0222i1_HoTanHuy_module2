package ss2_loop.bai_tap.bai_tap2;

import java.util.Scanner;

public class ktra_so_nguyen_to {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Num: ");
        num = scanner.nextInt();
        int count=1;
        int n =2 ;
        while (count<=num){
            boolean flg = true;
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    flg = false;
                    break;
                }
            }
            if (flg==true){
                System.out.println(n);
                count++;
            }

            n++;
        }
    }
}
