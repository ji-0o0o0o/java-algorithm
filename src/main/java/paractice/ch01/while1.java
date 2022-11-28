package paractice.ch01;

import java.util.Scanner;
//1부터 n까지의 합
public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1에서 n까지의 총합을 구합니다.");
        System.out.print("n은? ");int n = sc.nextInt();
        int sum =0;
        int i = 1;

        while (i<=n){
            sum+=i;
            i++;
        }
        System.out.printf("1에서 %d 까지의 총합은 %d, i는 %d",n,sum,i);

    }
}
