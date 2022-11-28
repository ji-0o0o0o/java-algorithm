package paractice.ch01;

import java.util.Scanner;

public class Max4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        System.out.println("4 정수의 최대값");
        System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d);

        int max = max4(a,b,c,d);
        System.out.println("최대값 = "+max);
    }
    static int max4(int a, int b, int c,int d){
        int max =a;
        if (b>max){
            max=b;
        }
        if (c>max) {
            max=c;
        }
        if (d>max) {
            max=d;
        }
        return max;
    }

}
