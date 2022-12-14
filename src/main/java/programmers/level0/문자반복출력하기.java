package programmers.level0;

public class 문자반복출력하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("hello",3));
    }
}
class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i <my_string.length() ; i++) {
            answer.append(String.valueOf(my_string.charAt(i)).repeat(Math.max(0, n)));
        }
        return answer.toString();
    }
}
