package ss3_array.bai_tap;

import java.util.Scanner;

public class dem_ktu_trong_chuoi {
    public static void main(String[] args) {
        String k;
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextLine();
        String x;
        System.out.println("input kt");
        x = scanner.nextLine();
        char c = x.charAt(0);
        int count =0;
        for (int i = 0; i < k.length() ; i++) {
            if (k.charAt(i)==c){
                count++;
            }
        }
        System.out.println("ktu "+c +" xuat hien "+count +"lan");
    }
}
