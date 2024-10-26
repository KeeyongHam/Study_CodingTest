import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        //첫번째 식
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        // 두번째 식
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        //각각의 x, y가 -999 <= x, y <= 999
        for(int i = -999; i <= 999; i++) {
            for(int j = -999; j <= 999; j++) {
                // ax + by 가 C이고(x = i, y = j)
                if(a*i + b*j  == c){
                    // dx + ey가 f일 때(x = i, y = j)
                    if(d*i + e*j  == f) {
                        bw.write(i + " " + j + "\n");
                        break;
                    }
                }
            }
        }
        bw.flush();
        bw.close();

    }
}

/* 다른 풀이
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        //첫번째 식
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        // 두번째 식
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        //x축
        bw.write((c*e- b*f) / (a*e - b*d) + " ");
        // y축
        bw.write((c*d - a*f) / (b*d - a*e) +"");
        bw.flush();
        bw.close();

    }
}
*/