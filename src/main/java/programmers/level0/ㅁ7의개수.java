package programmers.level0;

public class ㅁ7의개수 {

    /*
    * 문제 설명
    머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

    제한사항
    1 ≤ array의 길이 ≤ 100
    0 ≤ array의 원소 ≤ 100,000
    입출력 예
    array	result
    [7, 77, 17]	4
    [10, 29]	0
    입출력 예 설명
    입출력 예 #1

    [7, 77, 17]에는 7이 4개 있으므로 4를 return 합니다.
    입출력 예 #2

    [10, 29]에는 7이 없으므로 0을 return 합니다.   */

    static class Solution {
        public int solution(int[] array) {
            int answer = 0;

            String[] strArray = new String[array.length];
            //int배열을 문자열 배열로 바꿔준다.
            for (int i = 0; i < array.length; i++) {
                strArray[i] = String.valueOf(array[i]);
            }
            //문자열로 바꾼 배열 자리수마다 끊어서 7과 비교한다.
            for (String s : strArray) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '7') {
                        answer++;
                    }
                }
            }
            return answer;
        }
        public int solution2(int[] array) {
            int answer = 0;
            for(int a : array){
                while(a != 0){
                    if(a % 10 == 7){
                        answer++;
                    }
                    a /= 10;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{7, 77, 17}));

    }
}
