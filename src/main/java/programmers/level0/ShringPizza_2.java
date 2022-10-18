package programmers.level0;

public class ShringPizza_2 {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(6));
        System.out.println(sol.solution(10));
        System.out.println(sol.solution(4));



    }

    static class Solution {
        public int solution(int n) {
            int answer;
            for (int i = 1; true ; i++) {
                if (6*i%n==0){
                    answer = i;
                    break;
                }
            }
            return answer;
        }
    }
}
