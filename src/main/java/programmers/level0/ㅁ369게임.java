package programmers.level0;

public class ㅁ369게임 {
/**
 * 머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
 * 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 1 ≤ order ≤ 1,000,000
 * 입출력 예
 * order	result
 * 3	1
 * 29423	2
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 3은 3이 1개 있으므로 1을 출력합니다.
 * 입출력 예 #2
 *
 * 29423은 3이 1개, 9가 1개 있으므로 2를 출력합니다.
 * **/
    static class Solution {
        public int solution(int order) {
            int cnt = 0;
            String kStr = String.valueOf(order);

            for (int i = 0; i <kStr.length() ; i++) {
                if (kStr.charAt(i) == '3' || kStr.charAt(i) == '6' || kStr.charAt(i) == '9') {
                    cnt++;
                }
            }
            return cnt;
        }

        public int solution2(int order) {//나머지 이용한 풀이
            int answer = 0;

            while (order >= 1) {
                if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) answer ++;
                order /= 10;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3));
        System.out.println(solution.solution(29423));
    }
}
