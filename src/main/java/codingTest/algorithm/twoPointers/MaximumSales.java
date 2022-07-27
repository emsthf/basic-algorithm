package codingTest.algorithm.twoPointers;

import java.util.*;

// 3-3
public class MaximumSales {
    // sliding window 문제.
    // 이중 for문을 사용해 풀려고하면 N * K 번 연산을 해야하기 때문에 시간 초과가 날 수 있다.
    // sliding window를 사용하면 N번만 돌면 연산이 끝남
    // 창문을 이동하는 방법은 배열에서 순서대로 K개를 더해서 나온 sum을 한칸씩 밀면서 '+ arr[i] - arr[i-K]'를 해주면 된다.
    // 이렇게 하면서 sum이 기존 값보다 클때 바꿔치기

    public int solution(int n, int k, int[] arr) {
        // n은 배열 길이, k는 연속된 일 수
        int answer = 0, sum = 0;
        for (int i = 0; i < k; i++) {  // 연속된 일 수만큼 합산해서 기본 창문인 sum을 구한다
            sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {  // 연속된 일 수부터 배열 길이까지
            sum += (arr[i] - arr[i - k]);  // 창문을 이동시킬 때 빠지고, 추가하는 수를 계산해서 합산
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        MaximumSales m = new MaximumSales();
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
