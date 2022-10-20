package programmers.level0;

import java.util.Arrays;

public class FlipString {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution("jaron"));
        System.out.println(sol.solution("bread"));
    }

    static class Solution {
        public String solution(String my_string) {
            String answer = "";
            for (int i =my_string.length()-1; i >=0 ; i--) {
                answer+=my_string.charAt(i);
            }
            return answer;

//             다른 풀이
//            StringBuilder answer = new StringBuilder();
//            for (int i =my_string.length()-1; i >=0 ; i--) {
//                answer.append(my_string.charAt(i));
//            }
//            return answer.toString();
        }
    }
}
