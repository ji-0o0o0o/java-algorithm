package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTruncation {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 3, 5}, 1, 2)));
    }

    static class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            List<Integer> list = new ArrayList<>();
            for (int i = num1; i <= num2; i++) {
                list.add(numbers[i]);
            }
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);

            }
            return answer;
        }

        //다른 풀이1
        //return Arrays.copyOfRange(numbers, num1, num2 + 1);
        //다른 풀이2
        // int[] answer = new int[num2 - num1 + 1];
        //
        //        for(int i = num1, j = 0; i < num2+1; i++) {
        //            answer[j] = numbers[i];
        //            j++;
        //        }
        //
        //        return answer;
    }
}

