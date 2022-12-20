package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class 한번만등장한문자 {
    /*문제 설명
    문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

    제한사항
    0 < s의 길이 < 1,000
    s는 소문자로만 이루어져 있습니다.
    입출력 예
    s	result
    "abcabcadc"	"d"
    "abdc"	"abcd"
    "hello"	"eho"
    입출력 예 설명
    입출력 예 #1

    "abcabcadc"에서 하나만 등장하는 문자는 "d"입니다.
    입출력 예 #2

    "abdc"에서 모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.
    입출력 예 #3

    "hello"에서 한 번씩 등장한 문자는 "heo"이고 이를 사전 순으로 정렬한 "eho"를 return 합니다.
    */

    static class Solution {
        //전체다 비교해서 같은게 있으면 빈문자열로 대체
        //이거 80점만 나옴....
        public String solution(String s) {
            char[] a = s.toCharArray();
            Arrays.sort(a);//정렬 안하면 제대로 안지워짐...
            int b= a[0];
            for (int i = 1; i <a.length ; i++) {
                if (b==a[i]){
                    s=s.replaceAll(a[i]+"","");
                }
                b=a[i];
            }
            char[] c = s.toCharArray();
            Arrays.sort(c);//정렬

            return new String(c);
        }
        public String solution2(String s) {

            HashSet<String> set = new HashSet<>();//중복되면 안되니까

            for (int i = 0; i < s.length(); i++) {
                String replace = s.replace(s.charAt(i) + "", "");

                if(s.length() - replace.length() == 1){//본인 사라지니까
                    set.add(s.charAt(i)+"");
                }
            }

            ArrayList<String> list = new ArrayList<>(set);
            Collections.sort(list);//생략해도 값같음

            return String.join("", list);
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            System.out.println(s.solution("abcabcadc"));
            System.out.println(s.solution("abdc"));
            System.out.println(s.solution("hello"));
        }
    }
}
