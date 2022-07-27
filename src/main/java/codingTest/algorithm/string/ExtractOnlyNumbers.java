package codingTest.algorithm.string;

import java.util.*;

// 1-9
public class ExtractOnlyNumbers {
    public int solution(String str) {
        int answer = 0;
        for (char c : str.toCharArray()) {
            // 아스키 번호 48("0") ~ 57("9") 범위로 체크
            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }
        return answer;
    }

    public int solution2(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            // Character형으로 체크
            if (Character.isDigit(c)) {
                answer += c;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        ExtractOnlyNumbers e = new ExtractOnlyNumbers();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(e.solution2(str));
    }
}
