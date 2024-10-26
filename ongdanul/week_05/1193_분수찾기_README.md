## 🌵 문제 정보
분수찾기 <br>
[🚗 1193](https://www.acmicpc.net/problem/1193)

## 🌵 문제 정의

나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 

차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자

X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오

`input`
- 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다


- 1

`output`
- 첫째 줄에 분수를 출력한다


- 1/1


## 🌵 알고리즘 설계


1. Scanner 사용 + 반복문
```java
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();

    //해당 범위의 대각선 칸 개수, 직전 대각선 까지의 칸의 누적 합
    int cross_count = 1, prev_count_sum = 0;

    while (true) {

      // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
      if (X <= prev_count_sum + cross_count) {

        if (cross_count % 2 == 1) {
          /*
          대각선의 개수가 홀수라면 
          분자가 큰 수부터 시작
          분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
          분모는 X 번째 - 직전 대각선까지의 블럭 개수
          */
          System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
          break;
        }

        else {
          /*
          대각선상의 블럭의 개수가 짝수라면 
          홀수일 때의 출력을 반대로 
          */
          System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
          break;
        }

      } else {
        prev_count_sum += cross_count;
        cross_count++;
      }
    }
  }
}
```

<br>

2. Stream 사용
```java
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        //해당 범위의 대각선 칸 개수, 직전 대각선 까지의 칸의 누적 합
        int cross_count = 1, prev_count_sum = 0;

        while (true) {
  
          // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
          if (X <= prev_count_sum + cross_count) {
  
            if (cross_count % 2 == 1) {
              /*
              대각선의 개수가 홀수라면 
              분자가 큰 수부터 시작
              분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
              분모는 X 번째 - 직전 대각선까지의 블럭 개수
              */
              bw.write((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
              break;
            } else {
              /*
              대각선상의 블럭의 개수가 짝수라면 
              홀수일 때의 출력을 반대로 
              */
              bw.write((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
              break;
            }
  
          } else {
            prev_count_sum += cross_count;
            cross_count++;
          }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
```

