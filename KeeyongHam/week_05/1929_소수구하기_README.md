## 🌵 문제 정보
소수구하기 <br>
[🚗 1929](https://www.acmicpc.net/problem/1929)

## 🌵 문제 정의

M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

`input` <br>

* 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

* 3 16



`output` <br>

* 3 <br>
  5 <br>
  7 <br>
  11 <br>
  13

## 🌵 알고리즘 설계

1. 1은 소수가 아니기 때문에 패스한다.
2. 시간을 줄이기위해 i의 제곱근 만큼만 반복한다.
3. i % j를 했을 때 0이아니면 소수이고, 0이면 소수가 아니다.

```java
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = bf.readLine().split(" ");
        int M = Integer.parseInt(inputStr[0]);
        int N = Integer.parseInt(inputStr[1]);

        for (int i = M; i <= N; i++) {
            boolean isPrime = false;
            if (i == 1) {
                continue;
            }
            if (i <= 3) {
                System.out.println(i);
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j != 0) {
                    isPrime = true;
                } else {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
```