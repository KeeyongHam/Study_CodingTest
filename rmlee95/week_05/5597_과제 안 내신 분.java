import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[31];
        numbers[0] = 1;

        for (int i = 0; i < 28; i++) {
            numbers[sc.nextInt()] = 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 1) {
                System.out.println(i);
            }
        }
    }
}