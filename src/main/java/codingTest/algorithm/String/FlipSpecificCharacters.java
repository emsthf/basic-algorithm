package codingTest.algorithm.String;

import java.util.*;

// 1-5
public class FlipSpecificCharacters {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();  // 문자열을 문자 배열로 쪼개기
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {  // lt가 알파벳이 아니면
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {  // rt가 알파벳이 아니면
                rt--;
            } else {
                // lt, rt 둘다 알파벳이면 자리 바꾸기
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);  // 문자 배열을 문자로 변경

        return answer;
    }

    public static void main(String[] args) {
        FlipSpecificCharacters f = new FlipSpecificCharacters();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(f.solution(str));
    }
}
