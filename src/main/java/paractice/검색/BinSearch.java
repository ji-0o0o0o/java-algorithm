package paractice.검색;

import java.util.Scanner;

//이진검색
//반토막 내서 앞뒤 비교하는것
public class BinSearch {
    //요소수 n개인 배열 a 에서 key와 같은 요소를 이진 검색
    static int binSearch(int[] a, int n , int key){
        int pl =0;//첫번째
        int pr = n-1;//마지막

        do {
            int pc = (pl+pr)/2;
            if (a[pc]==key){
                return pc;      //검색 성공
            } else if (a[pc]<key) {
                pl=pc+1;//검색벙위 뒤쪽 절반으로
            }else pr=pc-1;//검색범위 앞쪽 절반으로
        }while (pl<=pr);

        return -1;//검색 실패
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요" );

        System.out.print("x[0]="); //첫 요소 입력 받음
        x[0]= sc.nextInt();

        for (int i = 1; i <num ; i++) {
            do {
                System.out.print("x["+i+"]= ");
                x[i]= sc.nextInt();
            }while (x[i]<x[i-1]);//오름차순으로 나오게 바로 앞 요소 보다 작으면 다시입력
        }

        System.out.print("검색할 값: ");
        int k = sc.nextInt();

        int idx = binSearch(x,num,k);

        if (idx==-1) System.out.println("검색결과 없습니다.");
        else
            System.out.println("그 값은 "+idx+"에 있습니다.");
    }
}
