package paractice.ch01;

import java.util.Scanner;

public class Squrelength {
    public static void main(String[] args) {
        System.out.println("정사각을 출력합니다");
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("n= "); n= sc.nextInt();
        }while (n<=0);

        for (int i = 0; i <n ; i++) {
                System.out.println("*".repeat(n));
            }
        }
    }

