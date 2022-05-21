package ss3_array.bai_tap;

import java.util.Random;
import java.util.Scanner;

public class tim_snn_mang1c {
    public static void main(String[] args) {
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Input n");
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= new Random().nextInt(100);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");
        int min= arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("Min = "+min);
    }
}
