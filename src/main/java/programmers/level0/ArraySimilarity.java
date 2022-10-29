package programmers.level0;


import java.util.Arrays;

public class ArraySimilarity {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println((Arrays.toString(new int[]{sol.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})})));
        System.out.println((Arrays.toString(new int[]{sol.solution(new String[]{"n", "omg"}, new String[]{"m", "dot"})})));
    }

    static class Solution {

        public int solution(String[] s1, String[] s2) {
            int answer = 0;
            for (String s : s1) {
                for (String value : s2) {
                    if (s.equals(value)) {
                        answer++;
                    }
                }
            }
            return answer;
        }
    }
}

