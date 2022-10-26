package programmers.level0;

public class GetAClothingStoreDiscount {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(150000));
        System.out.println(sol.solution(580000));
    }

    static class Solution {
        public int solution(int price) {
            int answer = 0;
            if (10<=price&&price<=1000000) {
                if (price>=500000) {
                    answer= (int) (price*0.8);
                }else if (price>=300000) {
                    answer= (int) (price*0.9);
                }else if (price>=100000){
                    answer= (int) (price*0.95);
                } else {
                    answer=price;
                }


            }
            return answer;
        }
    }
}

