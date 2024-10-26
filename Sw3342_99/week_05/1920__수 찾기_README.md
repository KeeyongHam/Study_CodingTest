## 🌵 문제 정보
수 찾기 <br>
[🚗 1920](https://www.acmicpc.net/problem/1920)

## 🌵 문제 정의
N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
`input`첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.<br>
- 5
  4 1 5 2 3
  5
  1 3 7 9 5
`output`M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.br>
- 1
  1
  0
  0
  1

## 🌵 알고리즘 설계

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] A = new int[N];
    
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    Arrays.sort(A);
    
    int M = sc.nextInt();
    
    for (int i = 0; i < M; i++) {
      int target = sc.nextInt();
      
      if (binarySearch(A, target)) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }

    sc.close();
  }
  
  public static boolean binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (arr[mid] == target) {
        return true;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return false;
  }
}

```

