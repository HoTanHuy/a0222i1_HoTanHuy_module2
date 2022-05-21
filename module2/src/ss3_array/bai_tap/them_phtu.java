package ss3_array.bai_tap;

import java.util.Scanner;

public class them_phtu {
    public static void output(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.printf(arr[i]+",");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n:");
        n = scanner.nextInt();
        int[]arr1;
        int[]arr2;
        arr1 = new int[n];
        arr2 = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr1[i]= scanner.nextInt();
        }
        output(arr1);
        int x;
        int index;
        System.out.println("Input x");
        x= scanner.nextInt();
        System.out.println("Input index i: ");
        index= scanner.nextInt();

        for (int i = 0; i < n; i++) {
            arr2[i]=arr1[i];
        }
        for (int i = n; i > index ; i--) {
            if (i!=index){
                arr2[i]=arr1[i-1];
            }
        }
        arr2[index]=x;
        output(arr2);
    }
}
