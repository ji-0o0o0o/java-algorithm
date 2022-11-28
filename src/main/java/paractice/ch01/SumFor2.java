package paractice.ch01;

import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        System.out.println("가우스 덧셈으로 1부터 n까지의 합 구하기");
        //가우스 덧셈 => (1+n)*(n/2)

        Scanner sc = new Scanner(System.in);
        System.out.print("n= "); int n = sc.nextInt();
        int sum = (1+n)*(n/2)+(n%2==0?0:n/2+1);
        System.out.printf("가우스 덧셈으로 1부터 %d까지의 합 %d",n,sum);

    }
}
