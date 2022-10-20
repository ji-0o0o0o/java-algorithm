package programmers.level0;

import java.util.Arrays;

public class LengthOfArrayElements {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new String[]{"We", "are", "the", "world!"})));
        System.out.println(Arrays.toString(sol.solution(new String[]{"I", "Love", "Programmers."})));
    }

    static class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];
            for (int i = 0; i < strlist.length; i++) {
                answer[i]=strlist[i].length();
            }
            return answer;
        }
    }
}

