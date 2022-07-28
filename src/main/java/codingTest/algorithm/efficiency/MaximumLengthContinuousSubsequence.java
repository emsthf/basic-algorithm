package codingTest.algorithm.efficiency;

import java.util.*;

// 3-6
public class MaximumLengthContinuousSubsequence {
    // two pointers 알고리즘
    // lt, rt를 사용하고, 배열을 진행하면서 0을 만나면 1로 바꾼셈 치고 cnt 값을 올려줌. cnt <= k
    // rt가 진행하면서 바꾼 0을 lt가 만나면 다시 원상복구 시킨다.
    // rt가 증가할 때 마다 연속 수열의 길이를 구한다. 수열의 길이는 "rt - lt + 1"
    // 새로 구한 길이가 기존 길이보다 클때 answer에 길이 업데이트

    // 3번째 0을 만나는 지점에서 cnt가 3이 되는데, 이때 cnt > k 조건이 거짓이 되기 위해 while문을 돌아야 한다.
    // lt는 rt가 지나간 0을 찾아서 다시 cnt를 -1 해주고 lt++ 시킨다. 그리고나서 lt부터 rt의 길이를 측정

    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {  // 배열을 탐색하면서 rt가 0을 만나면
                cnt++;  // cnt 증가시킴
            }
            while (cnt > k) {  // cnt가 k보다 클 때는 반복
                if (arr[lt] == 0) {  // lt가 0일 때
                    cnt--;  // cnt 감소
                }
                lt++;  // lt가 이동한 자리가 1일때는 lt 증가
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        MaximumLengthContinuousSubsequence m = new MaximumLengthContinuousSubsequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(m.solution(n, k, arr));
    }
}
