package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class bai_tap2_chuyen_doi_so {
    public static void main(String[] args) {
        String[]arr1;
//        String[]arr2;
        arr1 = new String[]{"Không ","Một ","Hai ","Ba ","Bốn ","Năm ","Sáu ","Bảy ","Tám ","Chín "};
//        arr2 = new String[]{"",}
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        int number = scanner.nextInt();
        int tram = number/100;
        int chuc = (number%100)/10;
        int dv = number%10;
        String kq ="";
        if (tram==0&&chuc==0&&dv==0){
            kq += arr1[0];
        }
        if (tram!=0 ){
            kq += arr1[tram] + "Trăm ";
            if ((chuc==0)&&(dv!=0)){
                kq += "Linh ";
            }
        }
        if ((chuc!=0)&&(chuc!=1)){
            kq += arr1[chuc] + "Mươi ";
            if ((chuc==0)&&(dv!=0)){
                kq+= "Linh ";
            }
        }
        if (chuc==1){
            kq+="Mười ";
        }
        switch (dv){
            case 1:
                if ((chuc!=0)&&(chuc!=1)){
                    kq+= "Mốt";
                }else {
                    kq+= arr1[dv];
                }
                break;
            case 5:
                if (chuc==0){
                    kq+=arr1[dv];
                }else {
                    kq+="Lăm ";
                }
                break;
            default:
                if (dv!=0){
                    kq+= arr1[dv];
                }
                break;
        }
        System.out.println("Thành chữ: "+kq);
    }
}
