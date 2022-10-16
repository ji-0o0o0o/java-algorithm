package programmers.level0;

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(3,2));
        System.out.println(sol.solution(7,3));
        System.out.println(sol.solution(1,16));



    }

    static class Solution {
        public int solution(int num1, int num2) {
            return (int)(num1/(float)num2*1000);
        }
    }
}
