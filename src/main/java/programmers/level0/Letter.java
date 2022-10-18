package programmers.level0;

public class Letter {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution("happy birthday!"));
        System.out.println(sol.solution("I love you~"));
    }

    static class Solution {
        public int solution(String message) {
            return message.length()*2;
        }
        }
    }

