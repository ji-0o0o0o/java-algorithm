package programmers.level0;

public class 특정문자제거하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("abcdef","f"));
    }
    static class Solution {
        public StringBuilder solution(String my_string, String letter) {
//            String answer = "";
            StringBuilder answer = new StringBuilder();

            for (int i = 0; i <my_string.length() ; i++) {
                if (my_string.charAt(i)!=letter.charAt(0)) {
                    answer.append(my_string.charAt(i));
                }
            }
            return answer;
        }
    }

    //다른 풀이
    static class Solution1{
        public String solution(String my_string, String letter) {
            String answer = "";

            answer = my_string.replace(letter, "");

            return answer;
        }
    }
}
