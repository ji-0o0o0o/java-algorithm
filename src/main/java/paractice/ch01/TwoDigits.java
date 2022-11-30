package paractice.ch01;

import java.util.Scanner;

//두자리의 양수 받기-> 논리연산과 드모르간 법칙
public class TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("두자리 양수를 적어주세요");

        do {
            System.out.print("no= ");no=sc.nextInt();
        }while (no<10||no>99);
        System.out.println("no= "+no);

    }
}
