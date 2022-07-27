package codingTest.algorithm.array;

import java.util.*;

// 2-11
public class InterimClassLeader {
    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        // 3중 for문으로 '학생'과 '비교 학생'과 '학년'을 돌아가면서 대조해본다.
        for (int i = 1; i <= n; i++) {  // 후보 학생
            int cnt = 0;
            for (int j = 1; j <= n; j++) {  // 같은 반이엇는지 비교할 대상 학생들
                for (int k = 1; k <= 5; k++) {  // 학년
                    if (arr[i][k] == arr[j][k]) {  // i학생이랑 같은 반을 한 j학생이 몇명인지 카운트
                        cnt++;
                        break;  // 한번 카운트 된 학생은 다른 학년에 중복 카운트 되면 안되므로 break로 빠져 나감.
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        InterimClassLeader cl = new InterimClassLeader();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];  // 학생은 1번부터 사용할 것이므로 n+1, 1~5학년까지 생겨야 하므로 5번 인덱스가 생기는 6까지.
        for (int i = 1; i <= n; i++) {  // 학생 번호
            for (int j = 1; j <= 5; j++) {  // 학년
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(cl.solution(n, arr));
    }
}
