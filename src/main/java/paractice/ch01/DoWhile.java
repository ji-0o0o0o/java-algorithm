package paractice.ch01;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("a,b를 비교한 후 b-a");

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("a= "); a= sc.nextInt();

//        do {
//            System.out.print("b= "); b= sc.nextInt();
//        }while (a>b);

        while (true){
            System.out.print("b= "); b= sc.nextInt();

            if(a<=b) break;
            System.out.println("a보다 큰값을 입력하세요!");
        }


        System.out.printf("%d,%d를 비교한 후 %d-%d는 %d이다",a,b,b,a,b-a);
    }
}
