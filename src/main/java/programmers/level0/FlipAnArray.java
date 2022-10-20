package programmers.level0;

import java.util.Arrays;

public class FlipAnArray {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 0, 1, 1, 1, 3, 5})));
    }

    static class Solution {
        public int[] solution(int[] num_list) {
            //1
            int[] answer = new int[num_list.length];
                for (int i = num_list.length-1,j=0;i>=0;i--,j++) {
                     answer[i]=num_list[j];
                }
            //2
            //for(int i = 0; i< num_list.length; i++){
            // answer[i] = num_list[num_list.length-i-1];

            return answer;
        }
    }
}
