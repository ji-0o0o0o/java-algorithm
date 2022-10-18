package programmers.level0;

public class AgeOutput {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(40));
        System.out.println(sol.solution(23));
    }

    static class Solution {
        public int solution(int n) {
            int year =2022;
            int age = 0;
            if(0<n&&n<=120){
             age = year-n+1;
            }
            return age;
        }
    }
}
