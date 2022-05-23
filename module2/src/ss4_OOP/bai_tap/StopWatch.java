package ss4_OOP.bai_tap;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import static java.lang.StrictMath.floor;
import static java.lang.StrictMath.random;

public class StopWatch {
    private Date startTime,endTime;
    public void setStartTime(Date startTime){this.startTime=startTime;}
    public Date getStartTime(){return this.startTime;}
    public void setEndTime(Date endTime){this.endTime=endTime;};
    public Date getEndTime(){return this.endTime;}
    public void start(){
        startTime = new Date();
    }
    public void stop(){
        endTime = new Date();
    }
    public long getElapsedTime(){
        return (endTime.getTime() - startTime.getTime());
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        double[]arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i]= floor(random()*100) + 1;
        }
        System.out.println("Array after sort");
        System.out.println(Arrays.toString(arr));
        stopWatch.start();
        Arrays.sort(arr);
//        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Array before sort");
        System.out.println(Arrays.toString(arr));
        System.out.printf("Elapsed Time= %d ms.",stopWatch.getElapsedTime());


    }
    private static void selectionSort(double[] arr){
        int length= arr.length;
        for (int i = 0; i < length; i++) {
            int min_pos= i;
            for (int j = i; j < length; j++) {
                if(arr[min_pos]> arr[j]){
                min_pos= j;}
            }

            if(min_pos!= i){
                double tmp= arr[min_pos];
                arr[min_pos]= arr[i];
                arr[i]= tmp;
            }
        }
    }
}
