package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class IceAmericano {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(5500)));
        System.out.println(Arrays.toString(sol.solution(15000)));
    }

    static class Solution {
        public int[] solution(int money) {
            int[] answer = new int[2];
            if (0<money&&money<=1000000) {
                answer[0] = money / 5500;
                answer[1] = money - ((money / 5500) * 5500);
            }

//            다른풀이
//            ArrayList<Integer> answer = new ArrayList<>();
//
//            answer.add(money/5500);
//            answer.add(money%5500);
            return answer;
        }
    }
}
