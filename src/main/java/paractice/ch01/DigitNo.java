package paractice.ch01;

import java.util.Scanner;

public class DigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정숫값의 자릿수를 구합니다.");
        int a;
        do {
            System.out.print("a= ");
            a = sc.nextInt();
        }while (a<=0);
        int dgt = 0;
        while (a!=0){
            dgt++;
            a/=10;
        }
        System.out.println("그 수는 "+dgt+"자리입니다");
    }
}
