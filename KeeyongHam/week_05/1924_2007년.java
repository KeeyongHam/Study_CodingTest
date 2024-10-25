package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = bf.readLine().split(" ");

        int month = Integer.parseInt(strings[0]);
        int day = Integer.parseInt(strings[1]);

        if (month != 1) {
            for (int i = 1; i < month; i++) {
                if (i == 2) {
                    day += 28;
                } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    day += 31;
                } else {
                    day += 30;
                }
            }
        }

        int w = (day - 1) % 7;
        System.out.println(week[w]);
    }
}
