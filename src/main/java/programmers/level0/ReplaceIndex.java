package programmers.level0;

public class ReplaceIndex {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println((sol.solution("hello", 1, 2)));
        System.out.println((sol.solution("I love you", 3, 6)));
    }

    static class Solution {
        public String solution(String my_string, int num1, int num2) {

            StringBuilder sb = new StringBuilder(my_string);
            sb.setCharAt(num1, my_string.charAt(num2));
            sb.setCharAt(num2, my_string.charAt(num1));

            return sb.toString();
        }
    }
}

