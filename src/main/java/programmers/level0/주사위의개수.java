package programmers.level0;

public class 주사위의개수 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 1, 1},1));
        System.out.println(solution.solution(new int[]{10,8,6},3));
    }
    static class Solution {
        public int solution(int[] box, int n) {
            int answer = 1;
            for (int j : box) {
                answer *= j / n;
            }
            return answer;
        }
    }
}
