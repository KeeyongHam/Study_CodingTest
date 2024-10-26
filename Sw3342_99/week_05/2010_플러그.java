import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int totalPlugs = 0;

        for (int i = 0; i < N; i++) {
            int plugs = scanner.nextInt();
            totalPlugs += plugs;
        }

        int maxComputers = totalPlugs - (N - 1);

        System.out.println(maxComputers);

        scanner.close();
    }
}