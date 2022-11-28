package paractice.ch01;

import java.util.Scanner;

public class SumFor3 {

    static int sumof(int a, int b){
        int sum =0;
        if (a>b){
            for (int i = b; i <=a ; i++) {
                sum+=i;
            }
        }else if (a==b) {return sum;
        }else {
                for (int i = a; i <=b ; i++) {
                    sum+=i;
                }
            }

        return sum;
    }

    static int sumof2(int a, int b){
        int min,max;
        int sum=0;
        if(a>b){
            min=b;
            max=a;
        }else {
            min=a;max=b;
        }
        for (int i = min; i <=max ; i++) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("정수 a,b사이의 합");
        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");a=sc.nextInt();
        System.out.print("b= ");b=sc.nextInt();

        int sum = sumof(a,b);
        System.out.printf("%d와 %d사이의 합은 %d",a,b,sum);
    }
}
