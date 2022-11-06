package paractice.class5.prac;

import java.util.Arrays;

//1~9사이 겹치지 않는 3자리 숫자
public class Prac_05 {
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        //배열 ballArr의임의의 요소를 골라서 위치를 바꾼다
        for (int i = 0; i < ballArr.length ; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;
            tmp =ballArr[0];
            ballArr[0] = ballArr[j];
            ballArr[j]=tmp;

        }
        //배열 ballArr의 앞에서 3개의 배열 ball3로 복사
        ball3 = Arrays.copyOf(ballArr,3);

        for (int i = 0; i < ball3.length ; i++) {
            System.out.print(ball3[i]);
        }

        }
    }

