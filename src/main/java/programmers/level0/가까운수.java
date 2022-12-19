package programmers.level0;

import java.util.Arrays;

public class 가까운수 {
    /*
    문제 설명
    정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ array의 길이 ≤ 100
    1 ≤ array의 원소 ≤ 100
    1 ≤ n ≤ 100
    가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
    입출력 예
    array	n	result
    [3, 10, 28]	20	28
    [10, 11, 12]	13	12
    입출력 예 설명
    입출력 예 #1

    3, 10, 28 중 20과 가장 가까운 수는 28입니다.
    입출력 예 #2

    10, 11, 12 중 13과 가장 가까운 수는 12입니다.
    * */
    static class Solution {
        public int solution(int[] array, int n) {
            Arrays.sort(array);
            int answer = array[0];
            //1.
            int min=Math.abs(array[0]-n);
            for (int i = 1; i <array.length ; i++) {
                if (min>Math.abs(array[i]-n)){
                    min=Math.abs(array[i]-n);
                    answer=array[i]; //이거 때문에 계속 오류남..
                }
            }
//            2.
//            int answer = array[0];
//            int min=Integer.MAX_VALUE;
//            for (int j : array) {
//                if (min > Math.abs(j - n)) {
//                    min = Math.abs(j - n);
//                    answer = j;
//                }
//            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 10, 28},20));
    }
}
