package programmers.level0;

public class Subtract {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(2,3));
        System.out.println(sol.solution(100,2));



    }

    static class Solution {
        public int solution(int num1, int num2) {
            int answer = num1-num2;
            return answer;
        }
    }
}
