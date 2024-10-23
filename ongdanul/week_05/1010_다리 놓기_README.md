## 🌵 문제 정보
다리 놓기 <br>
[🚗 1010](https://www.acmicpc.net/problem/1010)

## 🌵 문제 정의

도시에는 도시를 동쪽과 서쪽으로 나누는 큰 일직선 모양의 강이 흐르고 있다

하지만 다리가 없어서 시민들이 강을 건너는데 큰 불편을 겪고 있음을 알고 다리를 짓기로 결심하였다

강 주변에서 다리를 짓기에 적합한 곳을 사이트라고 한다

강 주변을 면밀히 조사해 본 결과 강의 서쪽에는 N개의 사이트가 있고 동쪽에는 M개의 사이트가 있다는 것을 알았다 (N ≤ M)

재원이는 서쪽의 사이트와 동쪽의 사이트를 다리로 연결하려고 한다 (이때 한 사이트에는 최대 한 개의 다리만 연결될 수 있다)

다리를 최대한 많이 지으려고 하기 때문에 서쪽의 사이트 개수만큼 (N개) 다리를 지으려고 한다

다리끼리는 서로 겹쳐질 수 없다고 할 때 다리를 지을 수 있는 경우의 수를 구하는 프로그램을 작성하라

`input`
- 입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다  <br>
  그 다음 줄부터 각각의 테스트케이스에 대해 강의 서쪽과 동쪽에 있는 사이트의 개수 정수 N, M (0 < N ≤ M < 30)이 주어진다


- 3 <br>
  2 2 <br>
  1 5 <br>
  13 29

`output`
- 각 테스트 케이스에 대해 주어진 조건하에 다리를 지을 수 있는 경우의 수를 출력한다
 

- 1 <br>
  5 <br>
  67863915

## 🌵 알고리즘 설계

N ≤ M 에서 최대한 많은 다리를 놓기 위해서는 N개의 다리가 필요하고, M개에서 다리를 놓을 포인트를 정해야한다 <br>
`M개 중 N개를 선택해야 한다는 뜻`, M개에서 N개를 선택하고 서로 중복 X 💡`조합 공식`

```
[1번 성질] 파스칼의 법칙

[2번 성질] n과 r이 같거나, r=0 이라면 1
```
```java
두 성질을 이용하여 알고리즘을 짜보면 다음과 같은 식으로 완성
        
main {
	print(combi(n, r));
}
 
int combi(int n, int r) {
 
	// 2번 성질
	if(n == r || r == 0) {
		return 1;
	}
	// 1번 성질
	return combi(n - 1, r - 1) + combi(n - 1, r);
}
```
```java
메모이제이션(Memoization)을 이용하여 동적계획법으로 활용하면
int[][] dp = new int[n + 1][r + 1];
        
main {
	print(combi(n, r));
}
 
int combi(int n, int r) {
    
    // 이미 탐색했던 경우 바로 반환
    if(dp[n][r] > 0) {
        return dp[n][r];
    }

    // 2번 성질
    if(n == r || r == 0) {
        return dp[n][r] = 1;
    }
    // 1번 성질
    return combi(n - 1, r - 1) + combi(n - 1, r);
}
```
`메모이제이션(Memoization)` 이미 풀린 하위 문제를 다시 풀지 않고 재활용 하는 것

1. Scanner 사용 + 반복문
```java
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
```

<br>

2. Scanner 사용 + 재귀
```java
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
```

3.Stream 사용
```java
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
```

