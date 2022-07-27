package codingTest.algorithm.array;

import java.util.*;

// 2-5
public class EratosthenesSieve {
    // 소수를 구하는 방법 중에는 에라토스테네스 체가 가장 빠른 방법이다.
    // 예시 범위가 넓을 때에는 무조건 에라토스테네스 체로 풀어야 시간 제한에 안걸린다.

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];  // n까지의 소수를 찾는 것이므로 계산하기 쉽게 배열 인덱스가 n까지 나오도록 한다.
        for (int i = 2; i <= n; i++) {  // 1은 소수가 아니므로 제외이기도 하고, n은 2<=n<=200,000 이므로 2부터 시작
            if (ch[i] == 0) {  // ch 배열의 i번째 인덱스가 0이다 = 소수로 걸러진 숫자
                answer++;
                for (int j = i; j <= n; j = j + i) {  // i의 배수로 찾아야 하므로 j는 i만큼 증가
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        EratosthenesSieve e = new EratosthenesSieve();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(e.solution(n));
    }
}
