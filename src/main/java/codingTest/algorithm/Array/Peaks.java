package codingTest.algorithm.Array;

import java.util.*;

// 2-10
public class Peaks {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];  // 주변 x 인덱스 값
                    int ny = j + dy[k];  // 주변 y 인덱스 값
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {  // 모서리를 제외해서 비교해 본래 위치보다 주변 값이 더 크다면
                        flag = false;
                        break;  // 주변 아무거나 하나라도 높으면 더 볼 필요 없이 바로 나가면 된다.
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Peaks p = new Peaks();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(p.solution(n, arr));
    }
}
