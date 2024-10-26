## 🌵 문제 정보
소수 찾기 <br>
[🚗 1978](https://www.acmicpc.net/problem/1978)

## 🌵 문제 정의

주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오

`input`
- 첫 줄에 수의 개수 N이 주어진다 <br>
  N은 100이하이다
- 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다


- 4 <br>
  1 3 5 7

`output`
- 주어진 수들 중 소수의 개수를 출력
 

- 3

## 🌵 알고리즘 설계

```
소수 판별 방법

1. 기본 판별 법 [시간복잡도 O(N)]

1 과 자기 자신만을 약수로 갖기 때문에 2 부터 판별하려는 수 직전까지 하나씩 나눠보면서
나누어 떨어지는 수가 없다면 소수, 나누어 떨어지는 수가 있다면 소수가 아님

boolean is_Prime(int num) {
 	// 1 은 소수가 아니다.
	if(num == 1){
		return false;	
	}
      
	// 2 ~ num-1 까지 중 나누어 떨어지는 약수가 있는지 판별    
	for(int i = 2; i < num; i++) {
		if(N % i == 0){
		  return false;
		}
	}
    
	// 위 두 조건에 걸리지 않으면 소수
	return true;
}

2. 제곱근을 이용한 기본 판별법 [시간 복잡도 O(√N)] 

num 을 A × B 의 합성수 (num = A × B) 라고 볼 때 아래와 같이 부등식을 세울 수 있다
 ⇨ ( 1 ≤ A, B < num )

여기서 만약 A 와 B 가 num 의 제곱근보다 커지면 위 부등식에 모순이 생긴다
A, B > sqrt( num )
↳  A × B > num

위 식은 결국 A × B = num 라는 식과 모순이므로 다음과 같은 결론을 내릴 수 있다
∴ 합성수 num = A × B 에서 A 와 B 중 적어도 하나는 num 의 제곱근보다 작거나 같다

boolean is_Prime(int num) {
 	// 1 은 소수가 아니다.
	if(num == 1){
		return false;	
	} 
    
	// 2 ~ num 제곱근까지 중 나누어 떨어지는 약수가 있는지 판별
	for(int i = 2; i <= Math.sqrt(num); i++) {
		if(N % i == 0) {
		  return false;
        }
	}

	// 위 두 조건에 걸리지 않으면 소수다.
	return true;
}

3. 에라토스테네스의 체 [시간복잡도 O(n ㏒ (㏒ n))]

만약 여러개의 소수를 구하고 싶을 때 체를 거르듯이 하는 방법을 쓰면 매우 쉽게 판별
방법 2를 적용시켜 구하려는 범위의 최댓값의 제곱근까지만 반복

public boolean[] make_prime(int Max) {
 	// 0 부터 시작하므로 +1
	boolean[] Prime = new boolean[Max + 1];
	
	// 0 과 1 은 소수가 아니므로 true
	Prime[0] = true;
	Prime[1] = true;
    
	for(int i = 2; i <= Math.sqrt(Max); i++) {
 		// 이미 걸러진 배열일 경우 다음 반복문으로 건너뜀
		if(Prime[i] = true) {
			continue;
		}
		
		/*
		정석대로라면 j = i * 2 부터 시작 
		이미 2의 배수가 걸러졌기때문에
		i 의 제곱수부터 시작해도 된다.
		*/
        
		for(int j = i * i; j < Max + 1; j = j + i) {
			Prime[j] = true;
		}
	}
 
	// 배열 index 가 소수라면 false 로, 아니라면 true 로 완성됨
	return Prime;
}

```

1. Scanner 사용
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int count = 0;

    for(int i = 0; i < N; i++) {

      // 소수인경우 true, 아닌경우 false   
      boolean isPrime = true;

      int num = sc.nextInt();

      // 1 인경우 다음 반복문으로
      if(num == 1) {
        continue;
      }
      for(int j = 2; j <= Math.sqrt(num); j++) {
        // 소수가 아니므로 false
        if(num % j == 0) {
          isPrime = false;
          break;
        }
      }
      // 소수인경우 count 값 1 증가
      if(isPrime) {
        count++;
      }
    }
    System.out.println(count);
    
    sc.close();
  }
}
```

<br>

2.Stream 사용
```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // N 사용 X
    br.readLine();
    int count = 0;

    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    while(st.hasMoreTokens()) {

      // 소수인경우 true, 아닌경우 false   
      boolean isPrime = true;

      int num = Integer.parseInt(st.nextToken());

      if(num == 1) {
        continue;
      }
      for(int i = 2; i <= Math.sqrt(num); i++) {
        if(num % i == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        count++;
      }
    }
    bw.write(count + " ");

    bw.flush();
    bw.close();
    br.close();
  }
}
```

