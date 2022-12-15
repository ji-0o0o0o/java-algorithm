package programmers.level0;

public class 개미군단 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(23));
    }
    static class Solution {
        public int solution(int hp) {
            int cnt = 0;
                if (hp>=5){
                    cnt+=hp/5;
                    hp%=5;
                }
            if (hp>=3){
                    cnt+=hp/3;
                hp%=3;
                }
            if (hp>=1){
                    cnt+=hp;
                }
            return cnt;
        }
    }
    //다른예시
    static class Solution1 {
        public int solution(int hp) {
            return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
        }
    }
}
