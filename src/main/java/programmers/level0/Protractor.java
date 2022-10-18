package programmers.level0;

public class Protractor {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(70));
        System.out.println(sol.solution(91));
        System.out.println(sol.solution(180));
    }

    static class Solution {
        public int solution(int angle) {
            int answer = 0;
            if (0< angle&&angle<=180) {
                if (angle < 90) {
                    answer = 1;
                } else if (angle == 90) {
                    answer = 2;
                } else if (90<angle&&angle<180) {
                    answer = 3;
                } else {
                    answer = 4;
                }
            }
            return answer;
        }
    }
}
