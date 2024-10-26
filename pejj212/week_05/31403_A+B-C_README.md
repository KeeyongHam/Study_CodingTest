## 🌵 문제 정보
A+B-C (브론즈4) <br>
[🚗 31403](https://www.acmicpc.net/problem/31403)

## 🌵 문제 정의
`input` <br>
-  3
   4
   5

`output` <br>
- 2
  29
## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String args[]) {
        /*
         * JavaScript에서 +, -은 수에 대해서는 일반적인 의미의 덧셈 뺄셈의 의미를 가지고 있습니다. 하지만 문자열에 대해서 +는 두 문자열을 이어붙이라는 의미이고, -는 양쪽 문자열을 수로 해석한 이후에 빼라는 의미입니다.
         * A, B, C를 각각 수와 문자열로 생각했을 때 A+B-C를 출력하세요.
         */
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        Integer B=sc.nextInt();
        Integer C=sc.nextInt();

        System.out.println(A+B-C);

        String s1 = A+"";
        String s2 = B+"";

        String s4 = s1+s2;

        int D = Integer.parseInt(s4);

        System.out.println(D-C);
    }
}
```

## 🌵 추가
문자열에서 - 연산은 불가능