import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Array = new int[N];
        int max = 0;
        int avg = 0;
        for(int i = 0; i < Array.length; i ++) { // 일단 최대값 구하기
            Array[i] = sc.nextInt();
            if(Array[i] > max) {
                max = Array[i];
            }
        }
    }

}