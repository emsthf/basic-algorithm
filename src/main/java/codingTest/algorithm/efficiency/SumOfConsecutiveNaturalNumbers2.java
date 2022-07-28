package codingTest.algorithm.efficiency;

import java.util.*;

// 3-5(2)
public class SumOfConsecutiveNaturalNumbers2 {
    // 같은 문제를 몫과 나머지를 이용한 수학적인 방법으로 풀 수도 있다.
    // 연속된 두 수를 더해서 15가 되는 경우를 찾는 방법:
    // 15에서 일단 연속된 최초 두자리인 1과 2를 뽑아낸다. 1과 2. 합 3을 뽑아냈으므로 15-3 = 12가 남았다.
    // 남은 12를 두자리에 똑같이 나눌수 있도록 /2 해서 1과 2 각각에 넣어준다. 1+6, 2+6(여기서 반으로 나눌때 정확하게 떨어져야만 한다)
    // 7, 8로 연속된 두 수의 합이 15가 되는 경우가 완성되었다.

    // 연속된 3수도 마찬가지의 방법을 사용한다.
    // 1, 2, 3을 뽑아내고 15-(1+2+3)=9를 3개로 나누어 분배해준다.(3으로 나눌 때 딱 떨어져야 한다.)
    // 1+3, 2+3, 3+3 => 4, 5, 6으로 연속된 세 수의 합이 15 완성

    // 이러한 방식으로 연속된 수의 개수를 늘려나가면 된다.

    public int solution(int n) {
        int answer = 0, cnt = 1;
        n--;  // n에서 1을 뺌
        while (n > 0) {
            cnt++;  // cnt는 연속된 자연수의 개수
            n = n - cnt;  // n에서 2를 뺌
            if (n % cnt == 0) {  // cnt로 나누어서 나머지가 0이면
                answer++;  // answer를 카운트
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfConsecutiveNaturalNumbers2 s = new SumOfConsecutiveNaturalNumbers2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(s.solution(n));
    }
}
