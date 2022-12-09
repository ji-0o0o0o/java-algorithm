package paractice.ch02;

import java.util.Random;
import java.util.Scanner;

public class CardConvEx {

    static int cardConvEx(int x, int r, char[] d ){
        int n = ((Integer)x).toString().length();//변환전 자리수
        int digits= 0;//변환후 자리수
        String didx = "0123456789ABCDEFGHIJKLMNOPQRSTUVEXYZ";
        int cnt=0;

        System.out.printf(String.format("%%2d | %%%dd\n",n),r,x);
        //%%%dd중 가운데 %d에 n이 들어가게 된다.
        //format에서 %%는 %랑 같음 따라서 %%%dd-> %nd라고 생각하면 된다.

        //r로 나눈 나머지 저장
        do{
            System.out.printf("  +---------\n");

            if(x/r!=0) {
                System.out.printf(String.format("%%2d | %%%dd   ...%%d\n", n), r, x / r, x % r);
            }else{
                System.out.printf(String.format("     %%%dd   ...%%d\n",n),x/r,x%r);
            }
            d[digits++]=didx.charAt(x%r);
            x/=r;
        }while (x!=0);
        //거꾸로 출력
        for (int i = 0; i <digits/2 ; i++) {
            char t = d[i];
            d[i]=d[digits-i-1];
            d[digits-i-1]=t;
        }
        return digits;
    }

    public static void main(String[] args) {
        int no;
        int cd; //진수
        int dno; // cardConvEx에서 return되는 자리값
        int retry;
        char[] cno = new char[32];
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("10진수를 기수 변환합니다 ");
        do{

        do {
            System.out.print("변환하는 음이 아닌 정수: ");
            no = sc.nextInt();
        }while (no<0);

        do {
            System.out.print("어떤 진수로 변환할까요?(2~36)");
            cd = sc.nextInt();
        }while (cd<2||cd>36);

        dno =cardConvEx(no,cd,cno);
        System.out.print(cd + "진수로는 ");
        for (int i = 0; i < dno; i++)			// 순서로 출력
            System.out.print(cno[i]);
        System.out.println("입니다.");

            System.out.print("한번 더 할까요? 1누르면 한번더! ");
            retry = sc.nextInt();
    }while (retry==1);
    }

}
