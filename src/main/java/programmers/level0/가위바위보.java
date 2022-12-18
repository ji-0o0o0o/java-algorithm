package programmers.level0;

import java.util.Arrays;

public class 가위바위보 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("205"));
    }
    static class Solution {
        public String solution(String rsp) {
            StringBuilder stringBuffer = new StringBuilder();

            for (int i = 0; i <rsp.length() ; i++) {
                String a = String.valueOf(rsp.charAt(i));
                if(a.equals("2"))stringBuffer.append("0");
                if(a.equals("5"))stringBuffer.append("2");
                if(a.equals("0"))stringBuffer.append("5");
            }
            return stringBuffer.toString();
        }
    }
}
