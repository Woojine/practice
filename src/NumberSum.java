import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String num = sc.next();

        int sum = 0; // 처음 숫자의 합 개수 0으로 초기화

        for(int i =0; i < N; i++){
            sum += num.charAt(i)-48; // charAt은 아스키코드 값 반환ㅋㅋ
        }
        System.out.println(sum);
    }
}