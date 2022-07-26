package codingTest.algorithm.Array;

import java.util.*;

// 2-12
public class Mentoring {
    public int solution(int n, int m, int[][] arr) {
        // n은 학생 수,
        int answer = 0;
        for (int i = 1; i <= n; i++) {  // 멘토를 할 학생
            for (int j = 1; j <= n; j++) {  // 멘티가 될 학생

                // 두 학생이 멘토, 멘티가 가능한지 연산
                int cnt = 0;
                for (int k = 0; k < m; k++) {  // 테스트 번호
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {  // 등수
                        if (arr[k][s] == i) {  // i의 등수
                            pi = s;
                        }
                        if (arr[k][s] == j) {  // j의 등수
                            pj = s;
                        }
                    }
                    if (pi < pj) {  // 멘토를 할 학생의 점수가 더 높은 횟수
                        cnt++;
                    }
                }
                if (cnt == m) {  // 멘토를 할 학생의 점수가 더 높은 횟수 = 총 시험 횟수일 때
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Mentoring mt = new Mentoring();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(mt.solution(n, m, arr));
    }
}
