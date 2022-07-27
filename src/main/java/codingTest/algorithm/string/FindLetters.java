package codingTest.algorithm.string;

import java.util.*;

// 1-1
public class FindLetters {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // 일반 for문을 사용하는 방법
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }

        // forEach를 사용하는 방법
        for (char c : str.toCharArray()) {
            if (c == t) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindLetters f = new FindLetters();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(f.solution(str, c));
    }
}
