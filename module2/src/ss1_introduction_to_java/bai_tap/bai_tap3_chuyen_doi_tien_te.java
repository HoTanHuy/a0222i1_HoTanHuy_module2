package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class bai_tap3_chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input $: ");
        int use = scanner.nextInt();
        int vnd = use*23000;
        System.out.println(use+"$ = "+vnd+"vnd");
    }
}
