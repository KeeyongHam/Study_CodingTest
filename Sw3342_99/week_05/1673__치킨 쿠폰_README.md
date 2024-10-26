## 🌵 문제 정보
치킨 쿠폰 <br>
[🚗 1673](https://www.acmicpc.net/problem/1673)

## 🌵 문제 정의
강민이는 치킨 한 마리를 주문할 수 있는 치킨 쿠폰을 n장 가지고 있다. 이 치킨집에서는 치킨을 한 마리 주문할 때마다 도장을 하나씩 찍어 주는데, 도장을 k개 모으면 치킨 쿠폰 한 장으로 교환할 수 있다.

강민이가 지금 갖고 있는 치킨 쿠폰으로 치킨을 최대 몇 마리나 먹을 수 있는지 구하여라. 단, 치킨을 주문하기 위해서는 반드시 치킨 쿠폰을 갖고 있어야 한다.

N개의 막대기에 대한 높이 정보가 주어질 때, 오른쪽에서 보아서 몇 개가 보이는지를 알아내는 프로그램을 작성하려고 한다.
`input`  여러 줄에 걸쳐서 자연수 n과 k가 주어진다.
- 4 3
  10 3
  100 5
`output`각 입력마다 한 줄에 정답을 출력한다. <br>
- 5
  14
  124

## 🌵 알고리즘 설계

```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int result;

    while(true){
      try{
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        result = n;

        while(true){
          if(result / k == 0){
            break;
          }else{
            n = n + result / k;
            result = result / k + result % k;
          }
        }

        System.out.println(n);

      }catch (Exception e){
        break;
      }
    }
  }
}  

```