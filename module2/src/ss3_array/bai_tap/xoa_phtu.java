package ss3_array.bai_tap;

import java.util.Scanner;

public class xoa_phtu {
    public static void main(String[] args) {
        int n;
        int x;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n: ");
        n = scanner.nextInt();
        int[]arr;
        arr = new int[n];
        for (int i =0; i < arr.length ; i++) {
            System.out.println("a["+i+"] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Input x:");
        x = scanner.nextInt();
        for (int i = c = 0; i < arr.length; i++) {
            if (arr[i]!=x){
                arr[c] = arr[i];
                c++;
            }
        }
        n =c ;
        System.out.println("ptu sao khi xóa "+x+" của mảng là : ");
        for (int i = 0; i < n; i++) {
            System.out.printf(arr[i]+",");
        }
    }
}
