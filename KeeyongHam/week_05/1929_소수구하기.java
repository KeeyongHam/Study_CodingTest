package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = bf.readLine().split(" ");
        int M = Integer.parseInt(inputStr[0]);
        int N = Integer.parseInt(inputStr[1]);

        for (int i = M; i <= N; i++) {
            boolean isPrime = false;
            if (i == 1) {
                continue;
            }
            if (i <= 3) {
                System.out.println(i);
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j != 0) {
                    isPrime = true;
                } else {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
