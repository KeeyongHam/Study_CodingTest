## 🌵 문제 정보
가로수 <br>
[🚗 2485](https://www.acmicpc.net/problem/2485)

## 🌵 문제 정의

직선으로 되어있는 도로의 한 편에 가로수가 임의의 간격으로 심어져있다 <br>

KOI 시에서는 가로수들이 모두 같은 간격이 되도록 가로수를 추가로 심는 사업을 추진하고 있다 <br>

KOI 시에서는 예산문제로 가능한 한 가장 적은 수의 나무를 심고 싶다 <br>

편의상 가로수의 위치는 기준점으로 부터 떨어져 있는 거리로 표현되며, 가로수의 위치는 모두 양의 정수이다 <br>

예를 들어, <br>

가로수가 (1, 3, 7, 13)의 위치에 있다면 (5, 9, 11)의 위치에 가로수를 더 심으면 모든 가로수들의 간격이 같게 된다 <br>

또한, 가로수가 (2, 6, 12, 18)에 있다면 (4, 8, 10, 14, 16)에 가로수를 더 심어야 한다 <br>

심어져 있는 가로수의 위치가 주어질 때, <br>

모든 가로수가 같은 간격이 되도록 새로 심어야 하는 가로수의 최소수를 구하는 프로그램을 작성하라 <br>

단, 추가되는 나무는 기존의 나무들 사이에만 심을 수 있다 <br>

`input`
- 첫째 줄에는 이미 심어져 있는 가로수의 수를 나타내는 하나의 정수 N이 주어진다(3 ≤ N ≤ 100,000)
- 둘째 줄부터 N개의 줄에는 각 줄마다 심어져 있는 가로수의 위치가 양의 정수로 주어지며, 가로수의 위치를 나타내는 정수는 1,000,000,000 이하이다 <br>
  가로수의 위치를 나타내는 정수는 모두 다르고, <br>
  N개의 가로수는 기준점으로부터 떨어진 거리가 가까운 순서대로 주어진다


- 4 <br>
  1 <br>
  3 <br>
  7 <br>
  13

`output`
- 모든 가로수가 같은 간격이 되도록 새로 심어야 하는 가로수의 최소수를 첫 번째 줄에 출력


- 3

## 🌵 알고리즘 설계

일정한 간격이 되도록 하는 가로수의 최소수를 구하려면 가로수 간격들 중에서 최대 공약수를 찾아야함

각 가로수 간격의 최대 공약수를 찾고, 전체 가로수의 수는 (최대위치-최소위치)/최대공약수+1

전체 가로수에서 심어져 있는 가로수를 빼서 결과를 구함

```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] streetTree =new int[N];

        for(int i = 0; i < N; i++){
            streetTree[i]=Integer.parseInt(br.readLine());
        }

        br.close();
        
        //가로수 간격의 최대 공약수를 저장하는 변수
        int gcd = 0;

        for(int i = 0; i < N-1; i++){
            int distance = streetTree[i+1] - streetTree[i];
            //가로수 간격의 최대 공약수
            gcd = findGCD(distance, gcd); 
        }

        //(streetTree[N-1]-streetTree[0])/gcd은 간격의 수니까
        //가로수의 나무의 개수를 구하려면 간격의 수에서 + 1을 해야한다
        bw.write((streetTree[N-1]-streetTree[0])/gcd+1-(streetTree.length) + "");
        bw.flush();
        bw.close();

    }

    //최대 공약수 구하기
    static int findGCD(int A, int B){
        while(B != 0){
            int R = A%B;
            A = B;
            B = R;
        }
        return A;
    }
}
```

