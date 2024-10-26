import java.util.Scanner;

public class Main {

    static int[][] dp = new int[30][30];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {

            int N = in.nextInt();
            int M = in.nextInt();

            sb.append(com(M, N)).append('\n');
        }

        System.out.println(sb);

    }

    static int com(int n, int r) {

        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = com(n - 1, r - 1) + com(n - 1, r);
    }
}
