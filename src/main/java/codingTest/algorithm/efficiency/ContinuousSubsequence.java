package codingTest.algorithm.efficiency;

import java.util.*;

// 3-4
public class ContinuousSubsequence {
    // two pointer과 sliding window 복합 문제.
    // 이중 for 문으로 풀 수는 있는데 역시나 이렇게 풀면 시간제한에 걸리게 된다. n,m이 엄청나게 크면 아주 많이 돌아야 하는 경우가 생기므로 비효율적.
    // n 범위의 제한(1<=n<=100,000)을 보는 순간 이중 for 문으로는 안되겠구나를 간파해야 한다.
    // two pointer 알고리즘이나 sliding window 알고리즘을 통해 n^2을 n으로 끝낸다는 생각을 해야 한다.
    
    public int solution(int n, int m, int[] arr) {
        // n은 배열의 크기, m은 합해서 나오는 수
        // lt와 rt를 두어서 window의 양쪽 끝값이 되도록 한다. lt부터 rt까지의 합이 sum이 된다. sum 값이 m이 되는지 확인
        // sum이 m보다 작으면 rt를 하나씩 증가하면서 sum에 더함
        // sum이 m보다 커지거나 같으면 sum에서 lt를 빼고 lt를 하나 증가시킨다. 그리고 sum과 m을 비교
        // 배열의 마지막에 도달했는데 sum이 m보다 작으면 종료. m보다 크면 lt를 빼고 하나 이동.

        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {  // rt는 for문 내부에서 초기화
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {  // 하나 빼서는 안되는 경우도 있으므로 while 사용. sum이 m보다 작을 때까지 반복
                sum -= arr[lt++];  // lt가 가리키는 값을 먼저 빼고 나서 lt 증가.
                if (sum == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ContinuousSubsequence c = new ContinuousSubsequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(c.solution(n, m, arr));
    }
}
