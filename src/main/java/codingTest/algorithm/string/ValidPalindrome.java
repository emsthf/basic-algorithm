package codingTest.algorithm.string;

import java.util.*;

// 1-8
public class ValidPalindrome {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        ValidPalindrome p = new ValidPalindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(p.solution(str));
    }
}
