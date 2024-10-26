import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = 0;
        int M = 0;
        int N = sc.nextInt();
        int[] cost = new int[N];

        for (int i = 0; i < cost.length; i++) {
            cost[i] = sc.nextInt();
        }

        for (int i = 0; i < cost.length; i++) {
            Y += (cost[i] / 30 + 1) * 10;
            M += (cost[i] / 60 + 1) * 15;
        }

        if (Y == M) {
            System.out.println("Y M " + Y);
        } else if (Y > M) {
            System.out.println("M " + M);
        } else {
            System.out.println("Y " + Y);
        }
    }
}