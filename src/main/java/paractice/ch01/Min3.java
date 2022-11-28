package paractice.ch01;

import java.util.Scanner;

public class Min3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("a = ");a=sc.nextInt();//적어주는게 어떤값인지 나타냄
        System.out.print("b = ");b=sc.nextInt();
        System.out.print("c = ");c=sc.nextInt();

        int min = min3(a,b,c);
        System.out.println("min= "+min);
    }
    static int min3(int a, int b, int c){
        int min=a;
        if (min>b){min=b;}
        if (min>c){min=c;}
        return min;
    }
}
