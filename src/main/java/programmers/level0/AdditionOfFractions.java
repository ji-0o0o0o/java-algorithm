package programmers.level0;

import java.util.Arrays;

public class AdditionOfFractions {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(sol.solution(9, 2, 1, 3)));



    }

    static class Solution {
         public int[] solution(int denum1, int num1, int denum2, int num2) {
             //분자
             int numerator =num2*denum1+num1*denum2;
             //분모
             int denominator = num1*num2;
             //최소공배수
             int lcm = 0;

             for (int i = 1; i <= numerator+denominator; i++) {
                 if (numerator%i ==0 && denominator%i ==0){
                     lcm =i;
                 }
             }

             return new int[]{(numerator/lcm),denominator/lcm};
        }
    }
}
