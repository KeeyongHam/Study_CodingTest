## 🌵 문제 정보
문자메시지 <br>
[🚗 2037](https://www.acmicpc.net/problem/2037)

## 🌵 문제 정의
오른쪽 그림과 같은 핸드폰 자판이 있다. 이 자판을 이용하여 어떤 영어 메시지를 치려고 할 때, 걸리는 최소 시간을 구하는 프로그램을 작성하시오.

단, 1번은 누를 경우에는 공백이 찍힌다고 하자. 그리고 만약에 AC라는 문자를 치려 한다면 A를 치고 난 후 일정 시간을 기다린 후 C를 치면 된다.

하나의 문자를 입력하려면, 버튼을 눌러야 한다. 버튼을 누르면 버튼에 쓰여 있는 문자가 입력되며, 버튼을 누를 때 마다 다음 문자로 바뀌게 된다. 예를 들어, 2를 누르면 A, 2번 누르면 B, 3번 누르면 C이다. 공백을 연속으로 누를 때는 기다릴 필요가 없다.


`input` <br>

* 첫째 줄에 p와 w가 주어진다. (1 ≤ p, w ≤ 1,000) p는 버튼을 한번 누르는데 걸리는 시간이고, w는 AC와 같은, 같은 숫자인 문자를 연속으로 찍기 위해 기다리는 시간을 의미한다. 그리고 둘째 줄에는 적을 문자열이 주어진다. 단, 이 문자열의 길이는 1000보다 작고, 맨 앞과 맨 뒤에 공백이 들어오는 경우는 없다. 문자열은 알파벳 대문자와 띄어쓰기만으로 이루어져 있다.

* 2 10 <br>
  ABBAS SALAM



`output` <br>

* 72

## 🌵 알고리즘 설계

1. 키보드의 개수와 키보드 속 알파벳 숫자를 넣는 2중 배열을 선언한다.
2. 이중배열을 중첩 반복문을 사용하여 돌린다.
3. 입력받은 문자와 키보드의 문자가 같으면, 키보드의 누른 횟수와 P를 곱해서 result에 저장한다.
4. 만약 전에 눌렀던 키보드와 지금 누른 키보드가 같으면 w를 더해준다.

```java
public class Main {
    public static void main(String[] args) throws IOException {
        String str[][] = {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"},
                {"j", "k", "l"},
                {"m", "n", "o"},
                {"p", "q", "r", "s"},
                {"t", "u", "v"},
                {"w", "x", "y", "z"}
        };

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] strNum = bf.readLine().split(" ");
        String[] inStr = bf.readLine().toLowerCase().split("");

        int p = Integer.parseInt(strNum[0]);
        int w = Integer.parseInt(strNum[1]);

        int result = 0;
        int lastNum = -1; //전에 눌렀던 숫자 찾기 위함
        for (String s : inStr) {

            if (s.equals(" ")) {
                lastNum = -1;
                result += p;
                continue;
            }

            boolean isFlag = false;

            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < str[i].length; j++) {
                    if (str[i][j].equals(s)) {

                        if (lastNum == i) {
                            result += w;
                        }

                        result += (j + 1) * p;
                        lastNum = i;
                        isFlag = true;
                        break;
                    }
                }

                if (isFlag) {
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
```