import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Array = new int[N+1];

        for(int i = 1; i <= N; i++) { //
            Array[i] = Array[i-1] + sc.nextInt();
        }
        int i;
        int j;
        for(int k = 0; k < M; k++) {
            i = sc.nextInt();
            j = sc.nextInt();
            System.out.println(Array[j] - Array[i-1]);
        }
    }
}
