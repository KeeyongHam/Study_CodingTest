import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        for(int i = 0; i < N; i++) {

            // 소수인경우 true, 아닌경우 false
            boolean isPrime = true;

            int num = sc.nextInt();

            // 1 인경우 다음 반복문으로
            if(num == 1) {
                continue;
            }
            for(int j = 2; j <= Math.sqrt(num); j++) {
                // 소수가 아니므로 false
                if(num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // 소수인경우 count 값 1 증가
            if(isPrime) {
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}
/*다른 풀이
import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // N 사용 X
    br.readLine();
    int count = 0;

    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    while(st.hasMoreTokens()) {

      // 소수인경우 true, 아닌경우 false
      boolean isPrime = true;

      int num = Integer.parseInt(st.nextToken());

      if(num == 1) {
        continue;
      }
      for(int i = 2; i <= Math.sqrt(num); i++) {
        if(num % i == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        count++;
      }
    }
    bw.write(count + " ");

    bw.flush();
    bw.close();
    br.close();
  }
}
*/