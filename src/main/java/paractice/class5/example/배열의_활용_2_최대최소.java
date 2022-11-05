package paractice.class5.example;

public class 배열의_활용_2_최대최소 {
    public static void main(String[] args) {
        int[] score = {79,88,91,33,100,55,95};
        int max = score[0]; //배열 최대값을 첫번째값으로 초기화
        int min = score[0]; //배열 최소값을 첫번째값으로 초기화

        for (int i = 1; i <score.length ; i++) {
            if (score[i]>max){ //첫번째 값과 비교해서 더 큰값이 나오면 그 값이 max값이 된다.
                max=score[i];
            }else if (score[i]<min){//첫번째 값과 비교해서 더 작은 값이 나온면 그 값이 min값
                min = score[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
