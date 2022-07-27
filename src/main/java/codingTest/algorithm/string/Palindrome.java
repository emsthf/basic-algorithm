package codingTest.algorithm.string;

import java.util.*;

// 1-7
public class Palindrome {
    public String solution(String str) {
        String answer="YES";

        // 양쪽 끝 문자부터 비교해서 판단하기
//        str = str.toUpperCase();
//        int len = str.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                return "NO";
//            }
//        }

        // StringBuilder 사용하는 방법
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(p.solution(str));
    }
}
