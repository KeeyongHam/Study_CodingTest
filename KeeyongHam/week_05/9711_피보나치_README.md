## 🌵 문제 정보
피보나치 <br>
[🚗 9711](https://www.acmicpc.net/problem/9711)

## 🌵 문제 정의

피보나치 수열은 아래와 같이 표현된다.

1, 1, 2, 3, 5, 8, 13, 21, 34, ...

각 숫자는 앞의 두 숫자의 합으로 나타내는 것을 알 수 있다.

P와 Q 그리고 n이 주어질 때, P번째 피보나치 숫자를 Q로 나눈 나머지를 구하여라.


`input` <br>

* 첫 번째 라인에는 정수 T개의 테스트 케이스가 주어진다. 각 테스트 케이스는 정수 P와 Q가 주어진다.
* 10 <br>
  5 10 <br>
  6 25 <br>
  10 21 <br>
  32 43 <br>
  100 100 <br>
  50 50 <br>
  25 25 <br>
  45 67 <br>
  109 32 <br>
  128 128 <br>



`output` <br>

* 각 테스트 케이스마다 "Case #x: M" 형식으로 출력한다. <br>
x는 테스트 케이스 번호(1부터 시작), M은 P번째 피보나치 숫자를 Q로 나눈 나머지이다.

* Case #1: 5 <br>
  Case #2: 8 <br>
  Case #3: 13 <br>
  Case #4: 15 <br>
  Case #5: 75 <br>
  Case #6: 25 <br>
  Case #7: 0 <br>
  Case #8: 19 <br>
  Case #9: 9 <br>
  Case #10: 69

## 🌵 알고리즘 설계

1. 숫자가 long을 초과하기 때문에 bigInteger를 사용한다.
2. 미리 피보나치를 값을 저장한다.
3. P 번 째 피보나치 수와 Q의 나머지 값을 출력한다.

```java
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        BigInteger[] bigIntegers = new BigInteger[10001];
        bigIntegers[0] = BigInteger.valueOf(1);
        bigIntegers[1] = BigInteger.valueOf(1);

        for (int i = 2; i < bigIntegers.length; i++) {
            bigIntegers[i] = bigIntegers[i - 1].add(bigIntegers[i - 2]);
        }

        for (int i = 1; i <= T; i++) {
            String[] input = bf.readLine().split(" ");
            int P = Integer.parseInt(input[0]);
            int Q = Integer.parseInt(input[1]);

            BigInteger result = bigIntegers[P - 1].remainder(BigInteger.valueOf(Q));

            System.out.println("Case #" + i + ": " + result);
        }
    }
}
```