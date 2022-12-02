package paractice.ch02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrays {

    static int maxOf(int[] a) {//int[] a참조변수 자리에 height참조변수가 들어가게됨 같은 숫자가 같은 데이터 가르키게됨
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("키의 최대값을 구합니다.");
//        //사람수를 기입
//        System.out.print("사람수 = ");
//        int num = sc.nextInt();
//        //요소수 num을 받는 배열생성
//        int[] height = new int[num];
//        //각 자리수에 들어가는 값 출력
//        for (int i = 0; i <num ; i++) {
//            System.out.printf("[%d]= ",i);
//            height[i]=sc.nextInt();
//        }
//
//        System.out.println("최대값은 "+maxOf(height));
//    }

    public static void main(String[] args) {
        //난수를 사용해서 배열의 요소값 설정하기
        Random random = new Random();//Ramdom클래스형의 변수를 만들기 위한 선언을 한다.
        //아래는 일반과 같게 불러옴
        Scanner sc= new Scanner(System.in);

        System.out.println("키의 최대값");

        //사람수 정하기
        System.out.print("사람 수는? ");
        int num = 1+random.nextInt(20);

        //사람수 만큼의 값넣어줄 배열 만들기
        int[] height = new int[num];

        //키값넣어주기
        System.out.println("키 값은 아래와 같다");
        for (int i = 0; i <num ; i++) {
            height[i]=100+random.nextInt(90);//height[i]번째에 값들을 넣어준다.
            //random.nextInt(90)은 0~89까지의 난수 생성
            System.out.printf("height[%d] = %d\n",i,height[i]);
        }
        System.out.println("최대값은 "+maxOf(height));

    }
}
