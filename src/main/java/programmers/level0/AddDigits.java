package programmers.level0;

public class AddDigits {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(1234));
        System.out.println(sol.solution(930211));
    }

    static class Solution {
        public int solution(int n) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            return sum;
        }
    }
}

