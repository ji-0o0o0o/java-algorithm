package programmers.level0;

import java.util.Arrays;

public class SquareRootJudgment {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(144));
        System.out.println(sol.solution(976));
    }

    static class Solution {
        public int solution(int n) {
            String answer = Math.sqrt(n) * 10 + "";
            int a ;
            if ((answer.charAt(answer.length() - 1)+"").equals("0")) {
                a = 1;
            }else{
                a=2;
            }
            return a;
//다른 풀이
//            if (n % Math.sqrt(n) == 0) {
//                return 1;
//            } else {
//                return 2;
//            }
        }
    }
}
