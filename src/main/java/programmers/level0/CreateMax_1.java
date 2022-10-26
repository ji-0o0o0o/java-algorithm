package programmers.level0;

public class CreateMax_1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(sol.solution(new int[]{0, 31, 24, 10, 1, 9}));
    }
    static class Solution {
        public int solution(int[] numbers) {
            int max =0;
            int submax=0;
            for (int number : numbers) {
                if (max < number) {
                    submax = max;
                    max = number;
                } else if (submax < number) {
                    submax = number;
                }
            }

            return max*submax;

            //다른 풀이
            // 오름차순으로 정리 후 출력...
            // Arrays.sort(numbers);
            //
            //        return numbers[numbers.length-1]*numbers[numbers.length-2];
        }
    }
}
