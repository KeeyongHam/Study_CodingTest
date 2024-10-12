## 🌵 문제 정보
곱셈<br>
[🚗 2558](https://www.acmicpc.net/problem/곱셈)

## 🌵 문제 정의
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.



(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
`input`  첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.<br>
- 472
  385
`output` 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.<br>
- 2360
  3776
  1416
  181720

## 🌵 알고리즘 설계
자릿수를 나눠 계산하기.
```java

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int j = sc.nextInt();

    System.out.println(i * (j % 10));
    System.out.println(i * (j % 100 / 10));
    System.out.println(i * (j / 100));
    System.out.println(i * j);

  }
}

```