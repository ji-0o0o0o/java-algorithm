package programmers.level0;

import java.util.Arrays;

public class EvenOddNum {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 3, 5, 7})));
    }

    static class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[2];
            for (int j : num_list) {
                if (j % 2 == 0) {
                    answer[0] += 1;
                } else if (j % 2 != 0) {
                    answer[1] += 1;
                }
            }
            //다른 풀이
            //for(int i = 0; i < num_list.length; i++)
            //            answer[num_list[i] % 2]++;
            return answer;
        }
    }
}

