package programmers.level0;

public class 암호해독 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("dfjardstddetckdaccccdegk",4));
        System.out.println(solution.solution("pfqallllabwaoclk"	,2));
    }
    static class Solution {
        public String solution(String cipher, int code) {
            String answer = "";
            for (int i = 0; i <cipher.length() ; i++) {
                char[] c = cipher.toCharArray();
                if ((i+1)%code==0){
                    answer+=c[i];
                }
            }

            return answer;
        }
        public String solution2(String cipher, int code) {
            String answer = "";

            for (int i = code; i <= cipher.length(); i = i + code) {
                answer += cipher.substring(i - 1, i);
            }

            return answer;
        }
    }
}
