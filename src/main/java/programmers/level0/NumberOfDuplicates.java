package programmers.level0;

public class NumberOfDuplicates {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(sol.solution(new int[]{180, 120, 140}, 190));
    }

    static class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            for (int j : array) {
                if (j == n) {
                    answer++;
                }
            }
            return answer;
        }
    }
}

