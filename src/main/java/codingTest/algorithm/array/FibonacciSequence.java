package codingTest.algorithm.array;

import java.util.*;

// 2-4
public class FibonacciSequence {
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;

        // 배열 없이 푸는 방법
//        int a = 1, b = 1, c;
//        System.out.print(a + " " + b + " ");
//        for (int i = 2; i < n; i++) {
//            c = a + b;
//            System.out.print(c + " ");
//            a = b;
//            b = c;
//        }
    }

    public static void main(String[] args) {
        FibonacciSequence f = new FibonacciSequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : f.solution(n)) {
            System.out.print(x + " ");
        }
    }
}
