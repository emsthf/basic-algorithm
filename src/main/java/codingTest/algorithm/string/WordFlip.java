package codingTest.algorithm.string;

import java.util.*;

// 1-4
public class WordFlip {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        // StringBuilder의 reverse 사용하가
//        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();  // StringBuilder().reverse()는 문자열 뒤집기
//            answer.add(tmp);
//        }

        // 직접 짝을 지어 뒤집기
        for (String x : str) {
            char[] s = x.toCharArray();  // 문자열을 문자 배열로 쪼개기
            int lt = 0, rt = x.length() - 1;  // lt는 왼쪽 끝 알파벳 인덱스, rt는 오른쪽 끝 알파벳 인덱스
            while (lt < rt) {
                // 두 알파벳 교환
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;

                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);  // valueOf는 변수로 사용하는게 아닌 Class로 사용하는 스태틱으로 선언된 클래스 매서드. 문자경 배열을 스트링화
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        WordFlip w = new WordFlip();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : w.solution(n, str)) {
            System.out.println(x);
        }
    }
}
