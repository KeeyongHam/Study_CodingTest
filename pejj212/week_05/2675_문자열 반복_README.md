## 🌵 문제 정보
문자열 반복 (브론즈2) <br>
[🚗 2675](https://www.acmicpc.net/problem/2675)

## 🌵 문제 정의
`input` <br>
-  2 <br>
   3 ABC <br>
   5 /HTP

`output` <br>
- AAABBBCCC <br>
  /////HHHHHTTTTTPPPPP
## 🌵 알고리즘 설계

```java
public class Main {
    public static void main(String args[]) {
        /*
         * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
         * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
         * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
         */
        Scanner sc = new Scanner(System.in);

        int T=sc.nextInt();

        for(int k=0; k<T; k++) {
            int R= sc.nextInt();
            String s=sc.next();

        	/*
        	char arr[] = new char[s.length()];

        	for(int i=0; i<s.length(); i++) {
        		arr[i]=s.charAt(i);
        	}*/

            for(int j=0; j<s.length(); j++) {
                for(int i=0; i<R; i++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
```

## 🌵 추가
배열로도 풀 수 있으나 바로 문자를 읽어온 게 더 간편함 <br>
System.out.println(); 위치가 헷갈린다