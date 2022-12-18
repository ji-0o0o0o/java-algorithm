package programmers.level0;

public class 외계행성의나이 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(23));
        System.out.println(solution.solution(51));
        System.out.println(solution.solution(100));
    }
    static class Solution {
        public StringBuilder solution(int age) {
            StringBuilder answer = new StringBuilder();
            while (age!=0){
                char tmp = (char)(age%10+97);
                answer.append(tmp);
                age/=10;
            }

            return answer.reverse();

        }
    }
}
