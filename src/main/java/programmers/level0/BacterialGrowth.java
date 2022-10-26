package programmers.level0;

public class BacterialGrowth {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println((sol.solution(2, 10)));
        System.out.println((sol.solution(7, 15)));
    }

    static class Solution {
        public long solution(int n, int t) {
            int answer = 0;

            for (int i = 0; i < t; i++) {
                answer += n * Math.pow(2, i);
            }

            return answer + n;
        }
        //다른 풀이
        //for(int i = 0; i < t; i++) {
        //            n *= 2;
        //        }


    }
}

