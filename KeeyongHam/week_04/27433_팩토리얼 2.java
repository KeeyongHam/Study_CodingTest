package week_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        long sum = 1;


        for (int i = 1; i <= N; i++) {
            sum *= i;
        }

        System.out.println(sum);
    }
}