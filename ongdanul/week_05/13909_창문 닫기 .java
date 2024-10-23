import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= Math.sqrt(N); i++) {
            count++;
        }
        /* 위와 동일
        for(int i = 1; i * i <= N; i++) {
          count++;
        }
        */

        System.out.println(count);

        sc.close();
    }
}
/*다른 풀이
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int count = 0;
    for(int i = 1; i <= Math.sqrt(N); i++) {
      count++;
    }
    *//* 위와 동일
    for(int i = 1; i * i <= N; i++) {
      count++;
    }
    *//*

    bw.write(count + " ");

    bw.flush();
    bw.close();
    br.close();
  }
}
*/