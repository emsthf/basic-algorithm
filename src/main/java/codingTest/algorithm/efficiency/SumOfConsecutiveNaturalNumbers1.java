package codingTest.algorithm.efficiency;

import java.util.*;

// 3-5(1)
public class SumOfConsecutiveNaturalNumbers1 {
    // 앞선 문제처럼 lt와 rt를 활용하는 문제

    public int solution(int n) {
        // 연속된 두 수 이상을 합해서 해당 수가 나올수 있는 경우는 최소 n/2의 몫에 +1한 경우까지이다.
        // 연속된 자연수의 합이 15라 하면 15/2의 몫인 7에 +1을 해 8까지만 돌면 된다.(8+9는 무조건 15를 넘기기 때문)
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1;  // 배열의 최대 범위. 연속된 자연수의 합 / 2의 몫 + 1
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {  // 1부터 m까지 배열에 넣기
            arr[i] = i + 1;
        }
        // lt와 rt를 밀고가는 two pointers 알고리즘 사용
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {  // 합이 n보다 크거나 같아졌을 때 반복
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfConsecutiveNaturalNumbers1 s = new SumOfConsecutiveNaturalNumbers1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(s.solution(n));
    }
}
