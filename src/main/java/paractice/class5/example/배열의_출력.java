package paractice.class5.example;

import java.util.Arrays;

public class 배열의_출력 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//        int[] iArr3 = new int[]{100,95,80,70,60};
        int[] iArr3 = {100,95,80,70,60};
        char[] chArr = {'a','b','c','d'};

        //iArr1 1~10순서대로
        for (int i = 0; i <iArr1.length ; i++) {
            iArr1[i]=i+1;
        }
        //iArr2 1~10순서대로
        for (int i = 0; i <iArr2.length ; i++) {
            iArr2[i]=i+1;
        }
        //배열에 저장된 값들 출력
        for (int j : iArr1) {
            if (j == iArr1.length) {
                System.out.print(j);
            } else {
                System.out.print(j + ",");

            }
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr1));
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);//주소 출력
        System.out.println(chArr);//char배열 출력했으니까 각 요소의 구분자없이 그대로 출력 됨
    }
}
