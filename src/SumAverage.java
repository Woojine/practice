import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float[] Array = new float[N];
        float M = 0;
        float avg = 0;
        for(int i = 0; i < Array.length; i ++) { // 일단 최대값 구하기
            Array[i] = sc.nextFloat();
            if(Array[i] > M) {
                M = Array[i];
            }
        }
        for(int j =0; j < Array.length; j++) {
            avg += (Array[j]/M*100)/N;
        }
        System.out.println(avg);
    }

}