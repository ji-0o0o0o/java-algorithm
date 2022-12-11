package paractice.ch02;

import java.util.Arrays;

public class CloneArray {
    //배열 요수 0개여도 가능 -> 빈배얄이라함
    //배열 요소에 접근할 수 있는지 여부 런타임(실행시)에 검사하는데 인덱스 음수이거나 요소수 이상의 인덱스 사용하면 IndexOutBonndsException 발생
    //배열이름.clone 으로 배열복제
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();

        b[3]=0;//b의 4번째 자리만 0으로 대입

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
