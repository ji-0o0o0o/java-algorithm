package programmers.level0;

public class ShringPizza_3 {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(7,10));
        System.out.println(sol.solution(4,12));



    }

    static class Solution {
        public int solution(int slice, int n) {
            int answer;
            int piece = n%slice;
                if (piece !=0){
                    answer = n/slice+1;
                }else {
                    answer=n/slice;
                }

            return answer;
        }
    }
}
