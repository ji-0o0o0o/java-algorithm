package programmers.level0;

public class TallerThanAShyPerson {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(sol.solution(new int[]{180, 120, 140}, 190));
    }

    static class Solution {
        public int solution(int[] array, int height) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i]>height){
                    count++;
                }
            }
            return count;
        }
    }
}

