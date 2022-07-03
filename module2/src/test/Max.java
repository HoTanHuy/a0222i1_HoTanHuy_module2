package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Max {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line = "";
            int max = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                if (max< Integer.parseInt(line)){
                    max = Integer.parseInt(line);
                }
            }
            bufferedReader.close();
            System.out.println("Max = "+max);
        } catch (Exception e) {
            System.out.println("File ko tồn tại hoặc file lỗi !!!!");;
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập link:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        Max readFileEx = new Max();
        readFileEx.readFileText(path);
    }
}
