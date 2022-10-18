package programmers.level0;

public class AverageOfArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(sol.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
    static class Solution {
        public double solution(int[] numbers) {
            int sum=0;

            for (int number : numbers) {
                sum += number;
            }
            return (float)sum/numbers.length;
        }
    }
}
