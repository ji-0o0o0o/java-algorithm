package programmers.level0;

public class 합성수찾기 {
    //문제 설명
    //약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
    //
    //제한사항
    //1 ≤ n ≤ 100
    //입출력 예
    //n	result
    //10	5
    //15	8
    //입출력 예 설명
    //입출력 예 #1
    //
    //10 이하 합성수는 4, 6, 8, 9, 10 로 5개입니다. 따라서 5를 return합니다.
    //입출력 예 #1
    //
    //15 이하 합성수는 4, 6, 8, 9, 10, 12, 14, 15 로 8개입니다. 따라서 8을 return합니다.

    static class Solution {
        public int solution(int n) {
            int answer = 0;//3개 이상일 때 개수
            for (int i = 1; i <=n ; i++) {
                int cnt = 0;//약수의 개수, 이거 위치 중
                for (int j = 1; j <=i ; j++) {
                    if (i % j == 0) {
                        cnt++;//나머지가 0일때 cnt 더해짐
                    }
                }
                if (cnt>=3)//약수 개수 3개 이상일때 합성수
                    answer++;
            }
            return answer;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
        System.out.println(solution.solution(15));
    }

}
