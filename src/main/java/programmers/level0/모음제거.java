package programmers.level0;

public class 모음제거 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("bus"));
        System.out.println(solution.solution("nice to meet you"));
    }

    static class Solution {
        public String solution(String my_string) {
            return my_string.replaceAll("[a|u|i|e|o|u]","");
//            String[] nums = my_string.replaceAll("[^0-9]", "").split("");
        }
        public String solution2(String my_string) {
            String answer = "";

            answer = my_string.replaceAll("[aeiou]", "");//따로 안나눠주고 한번에 적어줘도 똑같구나

            return answer;
        }
    }
}
