package ss3_array.bai_tap;

import java.util.Random;
import java.util.Scanner;

public class sum_duong_cheo_mang2c {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Input n");
        n= scanner.nextInt();
        int m;
        System.out.println("Input m");
        m = scanner.nextInt();
        int[][]arr;
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            //arr[i] = new int[m];
            for (int j = 0; j < m; j++) {
                //System.out.println("arr["+i+"]"+"["+j+']');
                arr[i][j] = new Random().nextInt(100);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
        int sum =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("sum = "+sum);
    }

}
