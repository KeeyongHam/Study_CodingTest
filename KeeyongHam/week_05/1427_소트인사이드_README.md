## 🌵 문제 정보
소트인사이드 <br>
[🚗 1427](https://www.acmicpc.net/problem/1427)

## 🌵 문제 정의

배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.


`input` <br>

* 첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
* 2143



`output` <br>

* 4321

## 🌵 알고리즘 설계

1. sort 메소드를 사용해 정렬하면 된다,

```java
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = bf.readLine().split("");

        List<Integer> intList = new ArrayList<>();

        Arrays.stream(strings).forEach(s -> intList.add(Integer.parseInt(s)));

        intList.sort(Comparator.reverseOrder());

        for (Integer i : intList) {
            System.out.print(i);
        }
    }
}
```