package paractice.ch01;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String s= a>0?"양수입니다":(a<0?"음수입니다":"0입니다.");

        System.out.println(s);
    }
}
