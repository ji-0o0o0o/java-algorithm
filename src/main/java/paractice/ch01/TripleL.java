package paractice.ch01;

import java.util.Scanner;


public class TripleL {
    //메서드 이용하여 왼쪽아래 직각인 이등변삼각형 출력
    static void triangleLB(int n){

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //왼쪽위가 직각인 이동변삼각형
    static void triangleLU(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {//j가 1일때 n-i+1개의 별이 찍힘
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //오른쪽 위가 직각인 이등변삼각형
    static void triangleRU(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.print(" ".repeat(i-1));
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    //오른쪽 아래가 직각인 이등변삼각형
    static void triangleRB(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.print(" ".repeat(n-i));
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void spira(int a){
        for (int i = 1; i <=a ; i++) {
            System.out.print(" ".repeat(a-i));
            for (int j = 1; j <=(i-1)*2+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void npira(int a){
        for (int i = 1; i <=a ; i++) {
            System.out.print(" ".repeat(a-i));
            for (int j = 1; j <=(i-1)*2+1 ; j++) {
                System.out.print(i%10);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단수는? ");int a =sc.nextInt();
        System.out.println("왼쪽 아래가 직각인 이동변삼각형 ");
        triangleLB(a);
        System.out.println("왼쪽 위가 직각인 이동변삼각형");
        triangleLU(a);
        System.out.println("오른쪽 아래가 직각인 이동변삼각형");
        triangleRB(a);
        System.out.println("오른쪽 위가 직각인 이동변삼각형");
        triangleRU(a);
        System.out.println("n단 피라미드");
        spira(a);
        System.out.println("n단 숫자피라미드");
        npira(a);
    }
}


