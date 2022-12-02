package paractice.ch02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CopyTesy {
    //배열 b의 요소를 모두 배열a에 복사
    static void copy(int[] a, int[] b){
//        int num = a.length <= b.length ? a.length : b.length;
        int num = Math.min(a.length, b.length);
        for (int i = 0; i <num ; i++) {
            a[i]=b[i];
        }
    }
    //배열 b의 요소를 배열 a에 역순으로 복사
    static void rcopy(int[] a, int[] b){
//        int num = a.length <= b.length ? a.length : b.length;
        int num = Math.min(a.length, b.length);
        for (int i = 0; i <num ; i++) {
            a[i]=b[num-i-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n = 1+random.nextInt(10);
        System.out.println("요소수= "+n);

        int[] b = new int[n];
        for (int i = 0; i <n ; i++) {
            b[i] = random.nextInt(10);
        }
        int[] a = new int[b.length];
//        for (int i = 0; i <n ; i++) { //있어도 없어도 상관없음 b로 덮히니까
//            a[i] = random.nextInt(9);
//        }

        System.out.println("배열 b의 요소를 모두 배열a에 복사");
        copy(a,b);
        System.out.println("a= "+Arrays.toString(a));
        System.out.println("b= "+Arrays.toString(b));

        System.out.println("배열 b의 요소를 배열 a에 역순으로 복사");
        rcopy(a,b);
        System.out.println("a= "+Arrays.toString(a));
        System.out.println("b= "+Arrays.toString(b));
    }
}
