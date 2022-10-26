package programmers.level0;
//순서쌍의 개수
public class NumberOfOrderedPairs {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(20));
        System.out.println(sol.solution(100));
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            if (1<=n &&n<=1000000){
            for (int i = 1; i <=n ; i++) {
                if (n%i==0){
                    answer++;
                    }
                }
            }
            return answer;
        }
    }
}

