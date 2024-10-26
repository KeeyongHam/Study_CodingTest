package week_05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 수 입력

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // 서쪽 사이트 개수
            int M = scanner.nextInt(); // 동쪽 사이트 개수
            System.out.println(combination(M, N)); // M개에서 N개 선택
        }

        scanner.close();
    }

    public static int combination(int n, int r) {
        // 조합 계산을 반복문으로 구현하여 큰 수를 줄이면서 계산
        if (r > n - r) {
            r = n - r; // 조합의 성질을 이용해 계산량을 줄임 (nCr == nC(n-r))
        }

        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }
}


