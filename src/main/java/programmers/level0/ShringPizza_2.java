package programmers.level0;

public class ShringPizza_2 {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(6));
        System.out.println(sol.solution(10));
        System.out.println(sol.solution(4));



    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            int a= 0;
            int b;
            int c;

            for (int i = 1; i <=6 ; i++) {
                if (6%i ==0 && n%i == 0){
                     a = i;
                }

            }
            b= 6/a;
            c=n/a;
            answer = a*b*c/6;
            return answer;
        }
    }
}
