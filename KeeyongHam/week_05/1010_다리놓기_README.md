## 🌵 문제 정보
다리놓기 <br>
[🚗 1010](https://www.acmicpc.net/problem/1010)

## 🌵 문제 정의

재원이는 한 도시의 시장이 되었다. 이 도시에는 도시를 동쪽과 서쪽으로 나누는 큰 일직선 모양의 강이 흐르고 있다. 하지만 재원이는 다리가 없어서 시민들이 강을 건너는데 큰 불편을 겪고 있음을 알고 다리를 짓기로 결심하였다. 강 주변에서 다리를 짓기에 적합한 곳을 사이트라고 한다. 재원이는 강 주변을 면밀히 조사해 본 결과 강의 서쪽에는 N개의 사이트가 있고 동쪽에는 M개의 사이트가 있다는 것을 알았다. (N ≤ M)

재원이는 서쪽의 사이트와 동쪽의 사이트를 다리로 연결하려고 한다. (이때 한 사이트에는 최대 한 개의 다리만 연결될 수 있다.) 재원이는 다리를 최대한 많이 지으려고 하기 때문에 서쪽의 사이트 개수만큼 (N개) 다리를 지으려고 한다. 다리끼리는 서로 겹쳐질 수 없다고 할 때 다리를 지을 수 있는 경우의 수를 구하는 프로그램을 작성하라.

`input` <br>

* 입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 그 다음 줄부터 각각의 테스트케이스에 대해 강의 서쪽과 동쪽에 있는 사이트의 개수 정수 N, M (0 < N ≤ M < 30)이 주어진다.


* 3 <br>
  2 2 <br>
  1 5 <br>
  13 29



`output` <br>

* 1 <br>
  5 <br>
  67863915

## 🌵 알고리즘 설계

1. 조합의 대칭성을 이용하여 계산 횟수를 줄인다.

```java
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt(); 

    for (int i = 0; i < T; i++) {
      int N = scanner.nextInt(); 
      int M = scanner.nextInt(); 
      System.out.println(combination(M, N));
    }

    scanner.close();
  }

  public static int combination(int n, int r) {
    
    if (r > n - r) {
      r = n - r; // 조합의 성질을 이용해 계산량을 줄임 (nCr == nC(n-r))
    }

    int result = 1;
    for (int i = 0; i < r; i++) {
      result *= (n - i);
      result /= (i + 1);
    }

    return result;
  }
}
```