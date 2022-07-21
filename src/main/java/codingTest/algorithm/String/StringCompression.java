package codingTest.algorithm.String;

import java.util.*;

// 1- 11
public class StringCompression {
    public String solution(String str) {
        String answer = "";
        str = str + " ";  // 마지막 문자를 계산하고 옆으로 넘어갈 때 indexOutOfBounds가 발생하지 않도록 빈칸 추가
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {  // 빈칸 전까지만 돌아야 하므로 'str.length() - 1'
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StringCompression s = new StringCompression();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(s.solution(str));
    }
}
