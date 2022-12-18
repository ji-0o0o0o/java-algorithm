package programmers.level0;

public class 대문자와소문자 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("cccCCC"));
        System.out.println(solution.solution("abCdEfghIJ"));
    }

    static class Solution {
        public String solution(String my_string) {

            String result="";
            for(char c: my_string.toCharArray()){
                //String.toCharArray() : char타입의 배열에 집어넣어주는 메서드
                //String을 char형 배열로 바꿔준다.

                // 아스키코드 대문자 : 65~90 소문자 : 97~122
                if( c>64 && c<91) {
                    char tmp = (char)(c+32);
                    result += tmp;
                } else {
                    char tmp = (char)(c-32);
                    result += tmp;
                }
            }
            return result;
        }
    }
}
