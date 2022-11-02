package programmers.level0;

public class StringInString {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution("ab6CDE443fgh22iJKlmn1o","6CD"));
        System.out.println(sol.solution("ppprrrogrammers","pppp"));



    }

    static class Solution {
        public int solution(String str1, String str2) {
            if (str1.contains(str2)) {
                return 1;
            }else {
                return 2;
            }
        }
    }
}
