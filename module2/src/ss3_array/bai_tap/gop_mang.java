package ss3_array.bai_tap;

import java.util.Scanner;

public class gop_mang {
    public static void output(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.printf(arr[i]+",");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[]arr1;
        int[]arr2;
        int[]arr3;
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        System.out.println("Input n: ");
        n = scanner.nextInt();
        System.out.println("Input m:");
        m = scanner.nextInt();
        arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a1["+i+"]");
            arr1[i] = scanner.nextInt();
        }
        output(arr1);
        arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("a2["+i+"]");
            arr2[i] = scanner.nextInt();
        }
        output(arr2);
        arr3 = new int[m+n];
        for (int i = 0; i < n; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < m ; i++) {
            arr3[n+i]=arr2[i];
        }
        output(arr3);
    }
}
