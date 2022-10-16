package programmers.level0;

public class MultiplyByTwo {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(3,4));
        System.out.println(sol.solution(27,19));



    }

    static class Solution {
        public Object solution(int num1, int num2) {
            if ((0 <= num1 && num1 <= 100) && (0 <= num2 && num2 <= 100)) {
                return num1 * num2;
            }
            return null;
        }
    }
}
