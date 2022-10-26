package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriangleCompletionCondition_1 {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println((sol.solution(new int[]{1, 2, 3})));
        System.out.println((sol.solution(new int[]{3, 6, 2})));
        System.out.println((sol.solution(new int[]{199, 72, 222})));
    }

    static class Solution {
        public int solution(int[] sides) {
            int answer ;
            int max = 0;
            int sum = 0;
            for (int i = 0; i <3 ; i++) {
                if (sides[i]>max){
                    max=sides[i];
                }
                sum +=sides[i];
            }
            if(sum-2*max>0){
                answer=1;
            }else {answer=2;}

            return answer;

            //다른 풀이
            // Arrays.sort(sides);
            //  return sides[2] >= sides[0]+sides[1] ? 2 : 1;
        }
    }
}

