package ss16_text_file.thuc_hanh.sum;

import java.io.*;
import java.util.Scanner;

public class Sum {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Sum = "+sum);
        } catch (Exception e) {
            System.out.println("File ko tồn tại hoặc file lỗi !!!!");;
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập link:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        Sum readFileEx = new Sum();
        readFileEx.readFileText(path);
    }
}
