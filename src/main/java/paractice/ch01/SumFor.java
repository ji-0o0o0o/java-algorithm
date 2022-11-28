package paractice.ch01;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합");
        Scanner sc = new Scanner(System.in);
        System.out.print("n= ");int n = sc.nextInt();

        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.printf("1부터 %d까지의 합은 %d이다",n,sum);

    }
}
