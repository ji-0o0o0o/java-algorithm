package programmers.level0;

public class ShringPizza_1 {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(7));
        System.out.println(sol.solution(1));
        System.out.println(sol.solution(15));



    }

    static class Solution {
        public int solution(int n) {
            int answer;
            if (n%7==0) {
                answer = n / 7;
            }else {
                answer = (n / 7)+1;
            }
            return answer;
        }
    }
}
