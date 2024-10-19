## 🌵 문제 정보
수학은 비대면강의입니다 <br>
[🚗 19532](https://www.acmicpc.net/problem/19532)

## 🌵 문제 정의

`input` <br>
- 1 3 -1 4 1 7

`output` <br>
- 2 -1

## 🌵 알고리즘 설계

1.반복문 이용
```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        //첫번째 식
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        // 두번째 식
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        //각각의 x, y가 -999 <= x, y <= 999
        for(int i = -999; i <= 999; i++) {
            for(int j = -999; j <= 999; j++) {
                // ax + by 가 C이고(x = i, y = j)
                if(a*i + b*j  == c){
                    // dx + ey가 f일 때(x = i, y = j)
                    if(d*i + e*j  == f) { 
                        bw.write(i + " " + j + "\n");
                        break;
                    }
                }
            }
        }
        bw.flush();
        bw.close();

    }
}
```

2.가감법 이용
```
가감법 공식

ax + by = c
dx + ey = f
연립 방정식이 위와 같을때

x를 구하려면
첫번째 방정식 양변에 e를 곱함, 두번째 방정식 양변에 b를 곱함
eax + eby = ec
bdx + eby = bf

위에서 나온 두 식을 가감
(eax + eby) - (bdx + eby) = ec - bf
eax - bdx = ec - bf
x(ea - bd) = ec - bf
x = (ec - bf) / (ea - bd)

y를 구하려면
첫번째 방정식 양변에 d를 곱함, 두번째 방정식 양변에 a를 곱함
adx + dby = cd
adx + aey = af

위에서 나온 두 식을 가감
(adx + dby) - (adx + aey) = cd - af
dby - aey = cd - af
y(db - ae) = cd - af
y= (cd - af) / (db - ae)
```

```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        //첫번째 식
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        // 두번째 식
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        //x축
        bw.write((c*e- b*f) / (a*e - b*d) + " ");
        // y축
        bw.write((c*d - a*f) / (b*d - a*e) +"");
        bw.flush();
        bw.close();

    }
}
```

