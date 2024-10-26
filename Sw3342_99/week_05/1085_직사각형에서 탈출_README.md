## 🌵 문제 정보
직사각형에서 탈출 <br>
[🚗 1085](https://www.acmicpc.net/problem/1085)

## 🌵 문제 정의
한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
`input` 첫째 줄에 x, y, w, h가 주어진다.<br>
- 6 2 10 3
`output` 첫째 줄에 문제의 정답을 출력한다.<br>
- 1

## 🌵 알고리즘 설계

```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int y = sc.nextInt();
    int w = sc.nextInt();
    int h = sc.nextInt();
    
    int distanceToLeft = x;
    int distanceToRight = w - x;
    int distanceToBottom = y;
    int distanceToTop = h - y;
    
    int minDistance = Math.min(Math.min(distanceToLeft, distanceToRight), Math.min(distanceToBottom, distanceToTop));
    
    System.out.println(minDistance);

    sc.close();
  }
}

```