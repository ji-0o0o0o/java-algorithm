package programmers.level0;

public class FindThePositionOfAPoint {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{2,4}));
        System.out.println(sol.solution(new int[]{-9,2}));
    }

    static class Solution {
        public int solution(int[] dot) {
            int answer ;
                if (0<=dot[0] && 0<=dot[1]){
                    answer=1;
                }else if (0>dot[0] && 0<dot[1]){
                    answer=2;
                }else if (0>dot[0] && 0>dot[1]){
                    answer=3;
                }else {
                    answer=4;
                }

            return answer;
        }
    }
}

