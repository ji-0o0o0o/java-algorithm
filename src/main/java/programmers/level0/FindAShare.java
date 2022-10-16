package programmers.level0;

public class FindAShare {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(10,5));
        System.out.println(sol.solution(7,2));



    }

    static class Solution {
        public int solution(int num1, int num2) {
            return num1/num2;
        }
    }
}
