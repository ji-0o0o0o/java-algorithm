package paractice.ch01;

import java.util.Scanner;

public class SumFor4 {
    public static void main(String[] args) {
        System.out.println("1부터 n까지 합");//정수만 더하게 하기, 음수,0은 안됨

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("n= ");n = sc.nextInt();
        }while (n<1);

        int sum = 0;

        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.printf("1부터 %d까지의 합은 %d",n,sum);

    }
}
