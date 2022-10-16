package programmers.level0;

public class CompareNum {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(2,3));
        System.out.println(sol.solution(11,11));
        System.out.println(sol.solution(7,91));



    }

    static class Solution {
        public int solution(int num1, int num2) {
            if(num1==num2){
                return 1;
            }else {
                return -1;
            }
        }
    }
}
