package codingTest.algorithm.array;

import java.util.*;

// 2-2
public class StudentWhoSees {
    public int solution(int n, int[] arr) {
        int answer = 1;  // 첫번째 사람은 무조건 보이므로 초기화는 1
        int max = arr[0];  // 첫번째 사람 키를 max 기준으로 잡음
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {  // 이전 최대 키보다 큰 사람이면
                answer++;  // 카운트++
                max = arr[i];  // max를 해당 사람키로 교체
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StudentWhoSees s = new StudentWhoSees();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(s.solution(n, arr));
    }
    // 이 문제를 이중 배열로 풀면 예제가 커질 때 1초 안에 연산이 안될 수도 있다.
}
