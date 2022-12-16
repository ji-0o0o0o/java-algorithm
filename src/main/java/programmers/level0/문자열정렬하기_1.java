package programmers.level0;

public class 문자열정렬하기_1 {
    public static void main(String[] args) {
        Solution solution= new Solution();
        System.out.println(solution.solution("hi12392"));
    }
    static class Solution {
        public String solution(String my_string) {
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i <my_string.length() ; i++) {
                if (my_string.charAt(i)<=9){
                    System.out.println(my_string.charAt(i));
                    answer.append((my_string.charAt(i)));
                }
            }
            return answer.toString();
        }
    }
}
