package programmers.level0;

import java.util.Arrays;

public class IHateEvenNum {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(10)));
        System.out.println(Arrays.toString(sol.solution(15)));


    }

    static class Solution {
        public int[] solution(int n) {
            int[] answer = new int[n];
            for (int i = 0; i <n ; i+=2) {
                answer[i] = i+1;
            }
            return Arrays.stream(answer)
                    .filter(i -> i != 0)
                    .toArray();
            }
        }
    }

