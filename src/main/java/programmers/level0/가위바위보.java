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
            String[] answer = new String[rsp.length()];
            for (int i = 0; i <rsp.length() ; i++) {
                if(rsp.charAt(i)==2)
                    answer[i]="0";
                else if(rsp.charAt(i)==5)answer[i]="2";
                else if(rsp.charAt(i)==0)answer[i]="5";
                System.out.println(answer[i]);
            }
            return Arrays.toString(answer);
        }
    }
}
