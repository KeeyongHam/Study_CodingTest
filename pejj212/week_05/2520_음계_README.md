## 🌵 문제 정보
음계 (브론즈2) <br>
[🚗 2520](https://www.acmicpc.net/problem/2520)

## 🌵 문제 정의
`input` <br>
- 8 1 7 2 6 3 5 4

`output` <br>
- mixed
## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String args[]) {
        /*
         * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
         * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
         * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
         */
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        String str="";

        for(int i=0; i<8; i++) {
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++) { //마지막은 구할 필요가 없어서?
            if(arr[i]==arr[i+1]-1) { //1 2 3 4 5 6 7 8
                str="ascending";
            }
            else if(arr[i]==arr[i+1]+1) { //8 7 6 5 4 3 2 1
                str="descending";
            }
            else { //한 번이라도 틀리면 바로 탈출
                str="mixed";
                break;
            }
        }
        System.out.println(str);
    }
}
```

## 🌵 추가