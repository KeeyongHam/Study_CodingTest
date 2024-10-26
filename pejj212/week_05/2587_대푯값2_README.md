## 🌵 문제 정보
대표값2 (브론즈2) <br>
[🚗 2587](https://www.acmicpc.net/problem/2587)

## 🌵 문제 정의
`input` <br>
-  10
   40
   30
   60
   30


`output` <br>
- 34 <br>
  30
## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String args[]) {
        /*
         * 어떤 수들이 있을 때, 그 수들을 대표하는 값으로 가장 흔하게 쓰이는 것은 평균이다. 평균은 주어진 모든 수의 합을 수의 개수로 나눈 것이다.
         * 예를 들어 10, 40, 30, 60, 30의 평균은 (10 + 40 + 30 + 60 + 30) / 5 = 170 / 5 = 34가 된다.
         * 평균 이외의 또 다른 대표값으로 중앙값이라는 것이 있다. 중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다.
         * 예를 들어 10, 40, 30, 60, 30의 경우, 크기 순서대로 늘어 놓으면
         * 10 30 30 40 60이 되고 따라서 중앙값은 30이 된다.
         * 다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.
         */
        Scanner sc = new Scanner(System.in);

        int arr[]=new int[5];

        for(int i=0; i<5; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int avg=0;
        for(int i=0; i<5; i++) {
            avg += arr[i];
        }
        avg = avg/5;

        System.out.println(avg);
        System.out.println(arr[2]);
    }
}

```

## 🌵 추가