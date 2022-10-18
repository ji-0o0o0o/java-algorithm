package programmers.level0;

public class LambSkewers {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(10,3));
        System.out.println(sol.solution(64,6));
    }

    static class Solution {
        public int solution(int n, int k) {
            int a= n/10;
            k=k-a;
            return n*12000+k*2000;
        }
        }
    }

