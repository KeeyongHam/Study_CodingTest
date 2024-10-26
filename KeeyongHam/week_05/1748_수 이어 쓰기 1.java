package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int result = 0; // 정답
        int digit = 10; // 자릿수
        int increase = 1; //증가하는 횟수
        for (int i = 1; i <= N; i++) {
            if (i == digit) {
                increase++;
                digit *= 10;
            }
            result += increase;
        }
        System.out.println(result);
    }
}