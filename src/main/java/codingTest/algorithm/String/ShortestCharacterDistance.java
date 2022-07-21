package codingTest.algorithm.String;

import java.util.*;

// 1- 10
public class ShortestCharacterDistance {
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);  // 기존 answer[i]와 p중 작은 것을 넣는다.
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ShortestCharacterDistance s = new ShortestCharacterDistance();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);  // 문자 1개 읽기
        for (int i : s.solution(str, c)) {
            System.out.print(i + " ");
        }
    }
}
