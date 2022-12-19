package programmers.level0;

public class 모스부호_1 {
    //제한사항
    //1 ≤ letter의 길이 ≤ 1,000
    //return값은 소문자입니다.
    //letter의 모스부호는 공백으로 나누어져 있습니다.
    //letter에 공백은 연속으로 두 개 이상 존재하지 않습니다.
    //해독할 수 없는 편지는 주어지지 않습니다.
    //편지의 시작과 끝에는 공백이 없습니다.
    //입출력 예
    //letter	result
    //".... . .-.. .-.. ---"	"hello"
    //".--. -.-- - .... --- -."	"python"
    //입출력 예 설명
    //입출력 예 #1
    //
    //.... = h
    //. = e
    //.-.. = l
    //.-.. = l
    //--- = o
    //따라서 "hello"를 return 합니다.
    //입출력 예 #2
    //
    //.--. = p
    //-.-- = y
    //- = t
    //.... = h
    //--- = o
    //-. = n
    //따라서 "python"을 return 합니다.
    //a ~ z에 해당하는 모스부호가 순서대로 담긴 배열입니다.
    //{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}
    static class Solution {
        public String solution(String letter) {
            String answer = "";
            String[] mos={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            String[] let = letter.split(" ");
            for (String s:let){
                for (int i = 0; i < mos.length ; i++) {
                    if (s.equals(mos[i])){
                        answer+=alp[i]+"";
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(".... . .-.. .-.. ---"));         // "hello"
        System.out.println(s.solution(".--. -.-- - .... --- -."	));  // "python"
    }

}
