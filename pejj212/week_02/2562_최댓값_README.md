## 🌵 문제 정보
최댓값 (브론즈3) <br>
[🚗 2562](https://www.acmicpc.net/problem/2562)

## 🌵 문제 정의
`input` <br>
- 3
  29
  38
  12
  57
  74
  40
  85
  61

`output` <br>
- 85 8

## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String[] args) {
        //9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        //입력받은 수를 저장할 배열
        int arr[]=new int[9];

        //자연수 입력받기
        for(int i=0; i<9; i++) {
            arr[i]=sc.nextInt();
        }

        int tmp = arr[0];
        int idx=0; //최댓값의 idx


        for(int i=0; i<arr.length; i++) {
            if(tmp < arr[i]) {
                tmp = arr[i];
                idx = i;
            }
        }
        System.out.println(tmp);
        System.out.println(idx+1);

    }
}
```
1. 자연수를 저장할 배열 arr 선언
2. 값을 비교할 변수 tmp, 인덱스를 저장할 변수 idx 선언
3. 자연수 입력받기
4. tmp에 arr[0] 값을 넣어 이후 인덱스들의 값과 비교하여 더 큰 값을 tmp에 집어넣기
5. tmp가 변경될 때마다 idx를 해당 자연수 값의 인덱스 번호로 변경


## 🌵 추가

Collections.max()로도 최댓값을 찾을 수 있을 거 같으나 인덱스 값을 찾으려면 역시 for문을 사용해야할 것 같다