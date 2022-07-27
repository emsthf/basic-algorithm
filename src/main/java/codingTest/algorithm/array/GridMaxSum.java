package codingTest.algorithm.array;

import java.util.*;

// 2-9
public class GridMaxSum {
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];  // 행의 합
                sum2 += arr[j][i];  // 열의 합
            }
            answer = Math.max(answer, sum1);  // 기존 answer와 sum1 둘 중 더 큰 값을 선택
            answer = Math.max(answer, sum2);  // 기존 answer와 sum2 둘 중 더 큰 값을 선택
        }
        // 각 대각선의 합 구하기
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer = Math.max(answer, sum1);  // 기존 answer와 sum1 둘 중 더 큰 값을 선택
        answer = Math.max(answer, sum2);  // 기존 answer와 sum2 둘 중 더 큰 값을 선택

        return answer;
    }

    public static void main(String[] args) {
        GridMaxSum g = new GridMaxSum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(g.solution(n, arr));
    }
}
