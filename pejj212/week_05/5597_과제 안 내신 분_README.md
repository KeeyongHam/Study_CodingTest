## 🌵 문제 정보
과제 안 내신 분..? (브론즈3) <br>
[🚗 5597](https://www.acmicpc.net/problem/5597)

## 🌵 문제 정의
`input` <br>
-  3
   1
   4
   5
   7
   9
   6
   10
   11
   12
   13
   14
   15
   16
   17
   18
   19
   20
   21
   22
   23
   24
   25
   26
   27
   28
   29
   30

`output` <br>
- 2
  8
## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String args[]) {
        /*
         * X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
         * 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
         */
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[31];
        int who = 0;

        for(int i=0; i<28; i++) {
            int a=sc.nextInt();
            arr[a-1]=1;
        }

        for(int j=0; j<30; j++) {
            if(arr[j]==0) {
                who = j+1;
                System.out.println(who);
            }
        }
    }
}
```

## 🌵 추가