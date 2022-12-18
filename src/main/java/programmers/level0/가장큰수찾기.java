package programmers.level0;

import java.util.Arrays;

public class 가장큰수찾기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 8, 3})));
        System.out.println(Arrays.toString(solution.solution(new int[]{9, 10, 11, 8})));
    }


    static class Solution {
        public int[] solution(int[] array) {
            int[] answer = {array[0],0};
            int max = array[0];
            for (int i = 1; i <array.length ; i++) {
            if (max<array[i]){
                max =array[i];
                answer[0]=max;
                answer[1]=i;
            }

            }
            return answer;
        }
        public int[] solution2(int[] array) {
            int[] answer = new int[2];

            for(int i=0;i<array.length;i++) {
                if(array[i] > answer[0]) {
                    answer[0] = array[i];
                    answer[1] = i;
                }
            }

            return answer;
        }
    }

}