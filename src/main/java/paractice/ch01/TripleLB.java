package paractice.ch01;

import java.util.Scanner;

public class TripleLB {
    public static void main(String[] args){
        System.out.println("왼쪽아래가 직각인 이등변삼각형을 출력합니다");
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("n= "); n= sc.nextInt();
        }while (n<=0);

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
