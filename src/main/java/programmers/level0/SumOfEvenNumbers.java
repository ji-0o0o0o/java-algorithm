package programmers.level0;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(10));
        System.out.println(sol.solution(4));
    }

    static class Solution {
        public int solution(int n) {
            int sum = 0;

            for (int i = 1; i <=n ; i++) {
                if (i%2==0){
                    sum +=i;
                }

            }
            return sum;
        }
        }
    }

