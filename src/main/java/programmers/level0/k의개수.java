package programmers.level0;

public class k의개수 {

    /*문제 설명
    1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ i < j ≤ 100,000
    0 ≤ k ≤ 9
    입출력 예
    i	j	k	result
    1	13	1	6
    10	50	5	5
    3	10	2	0
    입출력 예 설명
    입출력 예 #1

    본문과 동일합니다.
    입출력 예 #2

    10부터 50까지 5는 15, 25, 35, 45, 50 총 5번 등장합니다. 따라서 5를 return 합니다.
    입출력 예 #3

    3부터 10까지 2는 한 번도 등장하지 않으므로 0을 return 합니다.

    * */

    static class Solution {
        public int solution(int i, int j, int k) {
            int answer = 0;
            for (int l = i; l <=j ; l++) {//i와 j 사이에서 k가 몇개 존재하는지
                String numStr =  l+"";
                for (int m = 0; m <numStr.length() ; m++) {
                    int a =numStr.charAt(m);
                    a= a-48;
                    if(a==k){
                        answer++;
                    }
                }

            }
            return answer;
        }
        public int solution2(int i, int j, int k) {
            //str에 모두 나열한 후 replace를 통해서 k와 같은 것들을 빈 문자열로 바꾼 뒤
            //전체 str길이에서 k가 중복되는 문자를 빈문자열로 바꾼 str길이 빼준다
            String str = "";
            for(int a = i; a <= j; a++) {
                str += a+"";
            }

            return str.length() - str.replace(k+"", "").length();
        }
        public int solution3(int i, int j, int k) {
            //그냥 정수를 한 자리씩 꺼내서 k와 비교
            int answer = 0;

            for (int num = i; num <= j; num++){
                int tmp = num;
                while (tmp != 0){
                    if (tmp % 10 == k)
                        answer++;
                    tmp /= 10;
                }
            }
            return answer;
        }
        public int solution4(int i, int j, int k) {
            //헷갈렸던 부분 그냥 비교할때 -'0'을 해줘서 정수형으로 바꿔서 비교하면 되는건데..
            int answer = 0;

            for(int n = i; n<=j; n++){

                String str = n+"";
                for(int l = 0; l<str.length(); l++){
                    if(str.charAt(l)-'0'==k) answer++;
                }

            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1,13,1));
        System.out.println(s.solution(10,50,5));
        System.out.println(s.solution(3,10,2));
    }
}
