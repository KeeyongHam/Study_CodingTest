## 🌵 문제 정보
합 <br>
[🚗 8393](https://www.acmicpc.net/problem/8393)

## 🌵 문제 정의
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
`input` 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.<br>
- 3

`output` 1부터 n까지 합을 출력한다.<br>
- 6

## 🌵 알고리즘 설계

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        scanner.close();
    }
}


```