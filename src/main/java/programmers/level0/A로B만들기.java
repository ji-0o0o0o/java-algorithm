package programmers.level0;

import java.util.Arrays;

public class A로B만들기 {
   /*
   문제 설명
    문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

    제한사항
    0 < before의 길이 == after의 길이 < 1,000
    before와 after는 모두 소문자로 이루어져 있습니다.
    입출력 예
    before	after	result
    "olleh"	"hello"	1
    "allpe"	"apple"	0
    입출력 예 설명
    입출력 예 #1

    "olleh"의 순서를 바꾸면 "hello"를 만들 수 있습니다.
    입출력 예 #2

    "allpe"의 순서를 바꿔도 "apple"을 만들 수 없습니다.
   **/

    static class Solution {
        public int solution(String before, String after) {
            int besum = 0;
            int afsum = 0;
            char[] be = before.toCharArray();
            char[] af = after.toCharArray();

            for (char b :be) {
                besum+=b-'0';
            }
            for (char a :af) {
                afsum+=a-'0';
            }
            return besum==afsum?1:0;
            //조건에 같은 글자 수로 제한되어있으니까 문자의 합으로 비교를 한다.
        }
        public int solution2(String before, String after) {
            char[] a = before.toCharArray();
            char[] b = after.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);

            return new String(a).equals(new String(b)) ? 1 :0;
        }
        public int solution3(String before, String after) {
            for(int i = 0; i < before.length(); i++){
                after = after.replaceFirst(before.substring(i,i+1),"");
            }
            return after.length() == 0? 1: 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("olleh","hello"));
        System.out.println(solution.solution("allpe","apple"));


    }
}
