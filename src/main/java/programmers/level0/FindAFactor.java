package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAFactor {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(24)));
        System.out.println(Arrays.toString(sol.solution(29)));



    }

    static class Solution {
        public int[] solution(int n) {
            List<Integer> list = new ArrayList<>();

            for (int i = 1; i <=n ; i++) {
                if (n%i==0){
                    list.add(i);
                }
            }
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);

            }
            return answer;
        }
    }
}
