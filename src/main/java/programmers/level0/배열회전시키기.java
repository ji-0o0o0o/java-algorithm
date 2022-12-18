package programmers.level0;

import java.util.Arrays;
import java.util.Objects;

public class 배열회전시키기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 2, 3}, "right")));
        System.out.println(Arrays.toString(solution.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }
    static class Solution {
        public int[] solution(int[] numbers, String direction) {

            if ("right".equals(direction)) {
                int temp = numbers[numbers.length - 1];
                for (int i = numbers.length - 1; i > 0; i--) {
                    numbers[i] = numbers[i - 1];
                }
                numbers[0] = temp;
            } else {
                int temp = numbers[0];
                for (int i = 0; i < numbers.length - 1; i++) {
                    numbers[i] = numbers[i + 1];
                }
                numbers[numbers.length - 1] = temp;
            }
            return numbers;
        }
    }
}
