package paractice.ch02;

import java.util.Arrays;
import java.util.Scanner;

//배열값 거꾸로 출력
public class ReverseArray {
    //idx1과 idx2자리 바꿈
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=t;
    }
    //역순의로 정렬
    static void reverse(int[] a){
        for (int i = 0; i <a.length/2 ; i++) {
            swap(a,i, a.length-i-1);//식작되는 i가 0이므로 -1을 해준것
        }
    }
    static void reverse2(int[] a){
        for (int i = 0; i <a.length/2 ; i++) {
            swap(a,i, a.length-i-1);//식작되는 i가 0이므로 -1을 해준것
            System.out.printf("a[%d]와 a[%d]를 교환합니다.\n",i,a.length-i-1);
            System.out.println(Arrays.toString(a));
        }
        System.out.println("역순정렬이 끝났습니다.");
    }

    //배열의 모든 요소의 합계
    static int SumOf(int[] a){
        int sum=0;
//        for (int i = 0; i < a.length ; i++) {
//            sum+= a[i];
//        }
        for (int j : a){
            sum+=j;
        }
        return sum;
    }

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("요소수? ");int n = sc.nextInt();
//
//        int[] x = new int[n];
//
//        for (int i = 0; i < n ; i++) {
//            System.out.printf("[%d]= ",i);
//            x[i]=sc.nextInt();
//        }
//
//        reverse(x);//모든 요소 역전
//
//        System.out.println("모든 요소 역전으로 변경");
//        System.out.println(Arrays.toString(x));
//    }

    //위의 과정을 하나씩
    public static void main(String[] args) {
        int[] a={2,5,1,4,9,6,7};
        System.out.println(Arrays.toString(a));
        reverse2(a);
        System.out.println("배열 a의 합은 "+SumOf(a));
    }

}
