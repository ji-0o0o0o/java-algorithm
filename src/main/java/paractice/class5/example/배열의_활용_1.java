package paractice.class5.example;

public class 배열의_활용_1{
    public static void main(String[] args) {
        int sum =0;//총합을 위한 iv
        float average = 0f;//평균을 위한 iv

        int[] score = {100,88,100,100,90};

        for (int j : score) {
            sum += j;//반복문을 이용해 배열에 저장된값 하나씩 더한다.
        }
        average = sum / (float)score.length;//소수점까지 보여지게 하기위해 float로 나눔

        System.out.println(sum);
        System.out.println(average);
    }
}
