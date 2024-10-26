## 🌵 문제 정보
수 이어 쓰기 1 <br>
[🚗 1748](https://www.acmicpc.net/problem/1748)

## 🌵 문제 정의

1부터 N까지의 수를 이어서 쓰면 다음과 같이 새로운 하나의 수를 얻을 수 있다.

1234567891011121314151617181920212223...

이렇게 만들어진 새로운 수는 몇 자리 수일까? 이 수의 자릿수를 구하는 프로그램을 작성하시오.


`input` <br>

* 120



`output` <br>

* 252

## 🌵 알고리즘 설계

1. string append 이어 붙이면 시간 초과가 나온다.
2. 자리수가 달라질때마다 increase를 1씩 증가한다.

```java
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int result = 0; // 정답
        int digit = 10; // 자릿수
        int increase = 1; //증가하는 횟수
        for (int i = 1; i <= N; i++) {
            if (i == digit) {
                increase++;
                digit *= 10;
            }
            result += increase;
        }
        System.out.println(result);
    }
}
```