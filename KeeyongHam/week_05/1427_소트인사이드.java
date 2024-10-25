package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = bf.readLine().split("");

        List<Integer> intList = new ArrayList<>();

        Arrays.stream(strings).forEach(s -> intList.add(Integer.parseInt(s)));

        intList.sort(Comparator.reverseOrder());

        for (Integer i : intList) {
            System.out.print(i);
        }
    }
}