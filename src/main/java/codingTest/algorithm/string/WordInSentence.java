package codingTest.algorithm.string;

import java.util.*;

// 1-3
public class WordInSentence {
    public String solution(String str) {
        String answer = "";

        // split을 사용하는 방법
//        int m = Integer.MIN_VALUE;
//        String[] s = str.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            // 최대값 구하는 알고리즘
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }

        // indexOf를 사용하는 방법
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1) {  // indexOf는 해당 문자를 발견하지 못하면 -1 리턴
            System.out.println(pos);
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) {
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        WordInSentence w = new WordInSentence();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(w.solution(str));
    }
}
