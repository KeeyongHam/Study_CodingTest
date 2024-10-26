## 🌵 문제 정보
색종이 <br>
[🚗 2563](https://www.acmicpc.net/problem/2563)

## 🌵 문제 정의

가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다

이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다

이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오

`input`
- 첫째 줄에 색종이의 수가 주어진다
- 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다
- 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 <br>
  첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, <br>
  두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다
- 색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다


- 3 <br>
  3 7 <br>
  15 7 <br>
  5 2

`output`
- 첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다


- 260


## 🌵 알고리즘 설계



1. Scanner 사용
```java
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    //색종이 개수
    int N = sc.nextInt();
    //색종이 넓이
    int totalArea = 0;
    //도화지
    boolean[][] paper = new boolean[100][100];

    for (int i = 0; i < N; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();

      for (int j = x; j < x + 10; j++) {
        for (int k = y; k < y + 10; k++) {
          /*
          for 루프를 통해 모든 칸을 검사,
          해당 칸이 아직 덮이지 않은 상태(false)라면 
          true로 설정하여 면적 증가
          */
          if (!paper[j][k]) {
            paper[j][k] = true;
            totalArea++;
          }
        }

      }
    }
    System.out.println(totalArea);

    sc.close();
  }
}
```

<br>

2. Stream 사용
```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    //색종이 개수
    int N = Integer.parseInt(br.readLine());
    //색종이 넓이
    int totalArea = 0;
    //도화지
    boolean[][] paper = new boolean[100][100];

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      for (int j = x; j < x + 10; j++) {
        for (int k = y; k < y + 10; k++) {
          /*
          for 루프를 통해 모든 칸을 검사,
          해당 칸이 아직 덮이지 않은 상태(false)라면 
          true로 설정하여 면적 증가
          */
          if (!paper[j][k]) {
            paper[j][k] = true;
            totalArea++;
          }
        }

      }
    }
    bw.write(totalArea + " ");
    bw.flush();
    bw.close();
    br.close();
  }
}
```

