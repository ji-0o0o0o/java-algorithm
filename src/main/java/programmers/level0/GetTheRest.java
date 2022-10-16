package programmers.level0;

import java.util.Arrays;

public class GetTheRest {
    public static void main(String[] args) {

            Solution sol = new Solution();
            System.out.println(sol.solution(3,2));
            System.out.println(sol.solution(10,5));



        }

        static class Solution {
            public int solution(int num1, int num2) {
                return num1%num2;
            }
        }
    }
