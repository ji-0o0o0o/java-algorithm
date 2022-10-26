package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickMultiplesOFN {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
        System.out.println(Arrays.toString(sol.solution(5, new int[]{1, 9, 3, 10, 13, 5})));
        System.out.println(Arrays.toString(sol.solution(12, new int[]{2, 100, 120, 600, 12, 12})));
    }

    static class Solution {
        public int[] solution(int n, int[] numlist) {
            List<Integer> list = new ArrayList<>();
            for (int j : numlist) {
                if (j % n == 0) {
                    list.add(j);
                }
            }
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);

            }
            return answer;
        }
    }
}
