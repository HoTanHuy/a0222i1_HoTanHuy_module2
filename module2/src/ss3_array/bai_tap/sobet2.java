package ss3_array.bai_tap;

import java.util.Random;
import java.util.Scanner;

public class sobet2 {
    public static void main(String[] args) {
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Input n");
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            //arr[i]= new Random().nextInt(100);
            System.out.println("a["+i+"]=");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");
        int min= arr[0];
        int max= arr[0];
        int mint2 ;
        int maxt2 ;
        for (int i = 1; i < n; i++) {
            if (arr[i]<min){
                min= arr[i];
            }
            if (arr[i]>max){
                max= arr[i];
            }
        }
        mint2 = max;
        for (int i = 0; i < n; i++) {
            if (arr[i]>min && arr[i]< mint2){
                mint2 = arr[i];
            }
        }
        maxt2 = min;
        for (int i = 0; i < n; i++) {
            if (arr[i]<max && arr[i]> maxt2){
                maxt2 = arr[i];
            }
        }
        System.out.println("Min = "+min);
        System.out.println("Mint2 = "+mint2);
        System.out.println("Max = "+max);
        System.out.println("Maxt2 = "+maxt2);
    }
}
