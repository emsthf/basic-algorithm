package codingTest.algorithm.efficiency;

import java.util.*;

// 3-2
public class CommonElements {
    // 교집합 구하기 문제
    // two pointer 문제는 배열을 꼭 오름차순 정렬을 시켜 놓고 시작해야 한다!!
    // 두 포인터를 비교해서 같으면 answer 배열에 넣어버리고 두 포인트를 동시에 증가시키고, 같지 않으면 작은 쪽 포인터만 증가시킨다.
    // (오름차순 정렬이기 때문에 작은 포인터보다 작거나 같은 수는 없을 것이기 때문)

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 배열 오름차순 정렬
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {  // 두 포인터중 하나가 배열 범위를 벗어날 때까지 반복
            if (a[p1] == b[p2]) {  // 두 포인터가 같을 때
                answer.add(a[p1++]);  // a[p1]을 answer 배열에 추가하고 p1 1 증가
                p2++;  // p2도 1 증가
            } else if (a[p1] < b[p2]) {  // a[p1]이 더 작으면
                p1++;  // 작은 쪽 포인터 1 증가
            } else {
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CommonElements c = new CommonElements();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int x : c.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
