package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdditionOfHiddenNumbers_1 {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution("aAb1B2cC34oOp"));
        System.out.println(sol.solution("1a2b3c4d123"));
    }

    static class Solution {
        public int solution(String my_string) {
            int answer = 0;
            for (int i = 0; i <my_string.length() ; i++) {
                if ('0'<=my_string.charAt(i)&&my_string.charAt(i)<='9'){
                    answer+=my_string.charAt(i)-'0';
                }
            }
            return answer;
        }
    }
}

