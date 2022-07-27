package codingTest.algorithm.string;

import java.util.*;

// 1- 12
public class Password {
    public String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7)  // 0번부터 7번째 인덱스까지 자름
                    .replace('#', '1').replace('*', '0');  // 이진수로 변경
            int num = Integer.parseInt(tmp, 2);  // 이진법 숫자를 10진 숫자로 변경
            answer += (char) num;  // 숫자를 아스키 코드에 맞는 문자로 변경해서 저장
            str = str.substring(7);  // 7번 인덱스부터 시작
        }

        return answer;
    }

    public static void main(String[] args) {
        Password p = new Password();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(p.solution(n, str));
    }
}
