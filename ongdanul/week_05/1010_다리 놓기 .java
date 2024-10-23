import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] dp = new int[30][30];

        // 2번 성질 (n == r, r == 0)
        for (int i = 0; i < 30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }


        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                // 1번 성질
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }



        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {

            // M개중 N개를 뽑는 경우이므로 nCr 에서 n = M, r = N이다.
            int N = sc.nextInt();	// N = r
            int M = sc.nextInt();	// M = n

            sb.append(dp[M][N]).append('\n');
        }

        System.out.println(sb);

        sc.close();
    }
}
/*다른 풀이
import java.util.Scanner;

public class Main {

    static int[][] dp = new int[30][30];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {

            // M개중 N개를 뽑는 경우이므로 nCr 에서 n = M, r = N이다.
            int N = sc.nextInt();	// N = r
            int M = sc.nextInt();	// M = n

            sb.append(combi(M, N)).append('\n');
        }

        System.out.println(sb);

        sc.close();
    }

    static int combi(int n, int r) {

        // 이미 풀린 경우 바로 반환
        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        // 2번 성질
        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }

        // 1번 성질
        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
}
*/
/*다른 풀이
import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[][] dp = new int[30][30];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		StringTokenizer st;

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {

			st = new StringTokenizer(br.readLine(), " ");

			// M개중 N개를 뽑는 경우이므로 nCr 에서 n = M, r = N이다.
			int N = Integer.parseInt(st.nextToken());	// N = r
			int M = Integer.parseInt(st.nextToken());	// M = n


			sb.append(combi(M, N)).append('\n');
		}

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
	}

	static int combi(int n, int r) {

		// 이미 풀린 경우 바로 반환
		if(dp[n][r] > 0) {
			return dp[n][r];
		}

		// 2번 성질
		if(n == r || r == 0) {
			return dp[n][r] = 1;
		}

		// 1번 성질
		return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
	}
}
*/