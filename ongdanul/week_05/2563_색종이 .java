import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //색종이 개수
        int N = sc.nextInt();
        //색종이 넓이
        int totalArea = 0;
        //도화지
        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    /*
                    for 루프를 통해 모든 칸을 검사,
                    해당 칸이 아직 덮이지 않은 상태(false)라면
                    true로 설정하여 면적 증가
                    */
                    if (!paper[j][k]) {
                        paper[j][k] = true;
                        totalArea++;
                    }
                }

            }
        }
        System.out.println(totalArea);

        sc.close();
    }
}
/* 다른 풀이
import java.io .*;
        import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //색종이 개수
        int N = Integer.parseInt(br.readLine());
        //색종이 넓이
        int totalArea = 0;
        //도화지
        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    *//*
                    for 루프를 통해 모든 칸을 검사,
                            해당 칸이 아직 덮이지 않은 상태(false) 라면
                    true로 설정하여 면적 증가
                    *//*
                    if (!paper[j][k]) {
                        paper[j][k] = true;
                        totalArea++;
                    }
                }

            }
        }
        bw.write(totalArea + " ");
        bw.flush();
        bw.close();
        br.close();
    }
}
*/

