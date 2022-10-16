package programmers.level0;

import java.util.Arrays;

public class FindTheMedian {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{1, 2, 7, 10, 11}));
        System.out.println(sol.solution(new int[]{9, -1, 0}));


    }

    static class Solution {
        public int solution(int[] array) {
            //오름차순 정렬
            Arrays.sort(array);
            int answer = 0;
            for (int i = 0; i < array.length; i++) {
            answer=array[array.length/2];
            }
            return answer;
        }
    }
}
