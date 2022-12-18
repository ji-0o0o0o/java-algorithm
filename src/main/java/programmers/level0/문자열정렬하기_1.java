package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열정렬하기_1 {
    public static void main(String[] args) {
        Solution solution= new Solution();
        System.out.println(solution.solution("hi12392"));
        System.out.println(solution.solution("p2o4i8gj2"));
        System.out.println(solution.solution("abcde0"));
    }
    static class Solution {
        public int[] solution(String my_string) {
            String[] nums = my_string.replaceAll("[^0-9]", "").split("");
            int[] answer = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                answer[i] = Integer.parseInt(nums[i]);
            }
            Arrays.sort(answer);
            return answer;
        }
        public int[] solution2(String myString) {
            return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
        }
        public int[] solution3(String my_string) {

            my_string = my_string.replaceAll("[a-z]","");

            int[] answer = new int[my_string.length()];

            for(int i =0; i<my_string.length(); i++){
                answer[i] = my_string.charAt(i) - '0';
            }

            Arrays.sort(answer);

            return answer;
        }
    }
    }

