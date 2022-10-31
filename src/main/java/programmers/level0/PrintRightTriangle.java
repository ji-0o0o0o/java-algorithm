package programmers.level0;

import java.util.Scanner;

public class PrintRightTriangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (1<=n&&n<=10){
                for (int i = 1; i <=n ; i++) {
                    for (int j = 0; j <i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
        }
    }