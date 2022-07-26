package codingTest.algorithm.Array;

import java.util.*;

// 2-6
public class InvertedPrime {
    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {  // 약수가 존재하면
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;  // 1의 자리를 나머지로 저장
                res = res * 10 + t;  // res에 추가
                tmp = tmp / 10;  // 몫을  tmp에 다시 저장
            }  // 이를 반복해서 숫자를 뒤집는다.
            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        InvertedPrime inv = new InvertedPrime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : inv.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
