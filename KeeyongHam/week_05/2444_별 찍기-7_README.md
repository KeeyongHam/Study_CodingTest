## 🌵 문제 정보
별찍기-7 <br>
[🚗 2444](https://www.acmicpc.net/problem/2444)

## 🌵 문제 정의

예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

`input` <br>

* 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
* 5



`output` <br>

```text
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

## 🌵 알고리즘 설계

1. *은 3씩 증가 시키고, 공백은 1씩 감소시키면 된다.

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```