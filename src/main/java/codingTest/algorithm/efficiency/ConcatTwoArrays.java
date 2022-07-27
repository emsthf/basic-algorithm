package codingTest.algorithm.efficiency;

import java.util.*;

// 3-1
public class ConcatTwoArrays {
    // 두 배열을 합쳐서 오름차순으로 정렬하는 것도 정답이긴 하나, 코딩테스트에서 그런 방법을 쓰는 것은 별로 인상적이지 않은 방법이다.
    // => 이러한 것을 물어본다는 것은 two poniter 알고리즘을 알고있나? 물어보는 것과 같은 의미. 배열이 커질 수록 효율성이 엄청나게 차이가 나기 때문

    // 두 배열에 첫 인덱스에 각 포인터를 두고(p1, p2) 두 포인터를 비교해서 작은 수를 answer 배열에 추가
    // 추가 시킨 포인터는 옆으로 한칸 이동. 두 포인터의 값이 같다면 아무 포인터나 1칸 이동시키면 된다.
    // 하나의 포인터가 배열 끝까지 이동했는데 작은 수로 추가가 되어서 더 이동할 곳이 없다면, 남은 포인터의 수들을 모두 넣어버리면 된다.

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        // 두 포인터 중 하나라도 범위를 벗어날 때까지 반복
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                answer.add(a[p1++]);  // a[p1]을 answer 배열에 추가하고 p1 1증가
            } else {
                answer.add(b[p2++]);  // b[p2]를 answer 배열에 추가하고 p2 증가
            }
        }
        // 두 포인터 중 하나라도 범위를 벗어났을 때 나머지 포인터 값들 추가
        while (p1 < n) {
            answer.add(a[p1++]);
        }
        while (p2 < m) {
            answer.add(b[p2++]);
        }
        return answer;
    }

    public static void main(String[] args) {
        ConcatTwoArrays t = new ConcatTwoArrays();
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
        for (int x : t.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
