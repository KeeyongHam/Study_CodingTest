import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] newArr = new int[N];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = i + 1;
        }

        int idx1, idx2, tmp;

        for (int i = 0; i < M; i++) {
            idx1 = sc.nextInt() - 1;
            idx2 = sc.nextInt() - 1;

            tmp = newArr[idx1];
            newArr[idx1] = newArr[idx2];
            newArr[idx2] = tmp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}