package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        BigInteger[] bigIntegers = new BigInteger[10001];
        bigIntegers[0] = BigInteger.valueOf(1);
        bigIntegers[1] = BigInteger.valueOf(1);

        for (int i = 2; i < bigIntegers.length; i++) {
            bigIntegers[i] = bigIntegers[i - 1].add(bigIntegers[i - 2]);
        }

        for (int i = 1; i <= T; i++) {
            String[] input = bf.readLine().split(" ");
            int P = Integer.parseInt(input[0]);
            int Q = Integer.parseInt(input[1]);

            BigInteger result = bigIntegers[P - 1].remainder(BigInteger.valueOf(Q));

            System.out.println("Case #" + i + ": " + result);
        }
    }
}