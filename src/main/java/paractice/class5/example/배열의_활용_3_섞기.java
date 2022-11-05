package paractice.class5.example;

import java.util.Arrays;

public class 배열의_활용_3_섞기 {
    public static void main(String[] args) {
        int[] numArr ={0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));//배열 내용을 문자열로 출력

        for (int i = 0; i < 100; i++) {
            int n = (int)(Math.random()*10);//0~9까지의 난수 발생
            int tmp = numArr[0];//1번째 자리에 있는 수 임의의 공간에 저장
            numArr[0]=numArr[n];//n번째 자리에 있는 수 1번째 자리에 저장
            numArr[n]=tmp;//n번째 자리에 임의로 저장해놓은 수 n번째 자리에 저장
        }
        System.out.println(Arrays.toString(numArr));

    }
}
