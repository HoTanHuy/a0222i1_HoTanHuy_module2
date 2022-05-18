package ss2_loop.bai_tap.bai_tap3;

public class ktra_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100 ; i++) {
            boolean flg=true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    flg = false;
                    break;
                }
            }
            if (flg==true){
                System.out.println(i);
            }
        }
    }
}
