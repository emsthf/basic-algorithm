package codingTest.algorithm.string;

import java.util.*;

// 1-2
public class CaseConversion {
    public String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
//            if (Character.isLowerCase(c)) {
//                answer += Character.toUpperCase(c);
//            } else {
//                answer += Character.toLowerCase(c);
//            }

            // 아스키 코드로 대소문자 변환하기
            if (c >= 97 && c <= 122) {  // 소문자이면
                answer += (char) (c - 32);
            } else {
                answer += (char) (c + 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CaseConversion c = new CaseConversion();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(c.solution(str));
    }
}
