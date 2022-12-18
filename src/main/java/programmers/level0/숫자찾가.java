package programmers.level0;

public class 숫자찾가 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(29183,1));
        System.out.println(solution.solution(123456,7));

    }

    static class Solution {
        public int solution(int num, int k) {
            int answer = -1;
            String nums = num+"";
            for (int i = 0; i <nums.length() ; i++) {
                if (nums.charAt(i)==Character.forDigit(k,10)){
                   return i+1;
                }
            }
            return answer;
        }

        public int solution2(int num, int k) {
            String numStr = String.valueOf(num);
            String kStr = String.valueOf(k);

            int answer = numStr.indexOf(kStr);
            return answer < 0 ? -1 : answer + 1 ;
        }
    }
}
