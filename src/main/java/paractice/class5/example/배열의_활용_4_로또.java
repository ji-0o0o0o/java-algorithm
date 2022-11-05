package paractice.class5.example;

public class 배열의_활용_4_로또 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        //각 자리이에 1~45 저장한다.
        for (int i = 0; i < ball.length ; i++) {
            ball[i] = i+1;
        }
        int tmp;//두 값을 바꾸는데 사용할 임시변수
        int j ; //임의의 값을 얻어서 저장할 변수

        for (int i = 0; i <6 ; i++) {
            j = (int)(Math.random()* 45);//0~44의 난수
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        //각 번호 저장된 숫자 출력
        for (int i = 0; i <6 ; i++) {
            System.out.printf("ball[%d]=%d\n",i,ball[i]);

        }
    }
}
