package codingTest.algorithm.String;

import java.util.*;

// 1-6
public class RemoveDuplicateCharacters {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            // 자신의 위치와 처음 발견되는 문자 자리가 같으면 살려.
//            System.out.println(str.charAt(i) + " 자기 자리:" + i + " 처음 발견되는 자리:" + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RemoveDuplicateCharacters r = new RemoveDuplicateCharacters();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(r.solution(str));
    }
}
