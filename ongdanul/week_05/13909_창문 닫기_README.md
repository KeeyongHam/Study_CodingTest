## 🌵 문제 정보
창문 닫기 <br>
[🚗 13909](https://www.acmicpc.net/problem/13909)

## 🌵 문제 정의

서강대학교 컴퓨터공학과 실습실 R912호에는 현재 N개의 창문이 있고 또 N명의 사람이 있다 <br>

1번째 사람은 1의 배수 번째 창문을 열려 있으면 닫고 닫혀 있으면 연다 <br>
2번째 사람은 2의 배수 번째 창문을 열려 있으면 닫고 닫혀 있으면 연다 <br>
이러한 행동을 N번째 사람까지 진행한 후 열려 있는 창문의 개수를 구하라 <br>
단, 처음에 모든 창문은 닫혀 있다

예를 들어 현재 3개의 창문이 있고 3명의 사람이 있을 때, <br>

1번째 사람은 1의 배수인 1,2,3번 창문을 연다 (1, 1, 1) <br>
2번째 사람은 2의 배수인 2번 창문을 닫는다 (1, 0, 1) <br>
3번째 사람은 3의 배수인 3번 창문을 닫는다 (1, 0, 0) <br>
결과적으로 마지막에 열려 있는 창문의 개수는 1개 이다

`input`
- 첫 번째 줄에는 창문의 개수와 사람의 수 N(1 ≤ N ≤ 2,100,000,000)이 주어진다


- 3

`output`
- 마지막에 열려 있는 창문의 개수를 출력한다
 

- 1

## 🌵 알고리즘 설계

정수인 N을 입력받는데 이 N은 사람 수 이면서 창문의 개수

N번째 사람의 N의 배수인 창문에 대해 동작을 시행 (`닫혀있으면 열고, 열려있으면 닫는다`)

약수의 개수가 홀수인 경우 열고-닫고-열기 이니 마지막에는 열려있다

`N까지의 숫자중에 약수의 개수가 홀수인 숫자를 찾으면 되는 문제`

`약수가 홀수인 것은 제곱 수밖에 없다`

1. Scanner 사용
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int count = 0;
    
    for(int i = 1; i <= Math.sqrt(N); i++) {
      count++;
    }
    /* 위와 동일   
    for(int i = 1; i * i <= N; i++) {
      count++;
    }
    */

    System.out.println(count);

    sc.close();
  }
}
```

<br>

2.Stream 사용
```java
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int count = 0;
    for(int i = 1; i <= Math.sqrt(N); i++) {
      count++;
    }
    /* 위와 동일   
    for(int i = 1; i * i <= N; i++) {
      count++;
    }
    */
    
    bw.write(count + " ");

    bw.flush();
    bw.close();
    br.close();
  }
}
```

