package programmers.level0;

import java.util.Arrays;

public class DoubleTheArray {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5})));



    }

    static class Solution {
        public int[] solution(int[] numbers) {

            int[] answer = new int[numbers.length];
            for (int i = 0; i <numbers.length ; i++) {
                answer[i]=numbers[i]*2;
            }
            return answer;
        }
    }
}
