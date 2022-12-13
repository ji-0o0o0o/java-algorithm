package paractice.검색;

import java.util.Random;
import java.util.Scanner;

//선형검색(보초법)
//맨 마지막 뒤에 검색할 값으로 정해서 원하는 값을 찾지 못해도 다시 한번 종료판단하는것을 막아준다.
public class SeqSearchSen {
    static int seqSearchSen(int[] a , int n, int key){
        a[n]=key;
        int i =0;
        while (true){
            if (a[i]==key){//검색 성공
                break;
            }
            i++;
        }
        return i == n ? -1:i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        //요소수의 개수
        System.out.print("요소수 개수: ");
        int num =sc.nextInt();
        //배열 만들어준다
        int[] a = new int[num+1];//맨뒤에 보초 적어주미로

        //하나씩 적어준다.
        for (int i = 0; i <num ; i++) {
            a[i]= random.nextInt(num+1);
            System.out.print("a["+i+"]: "+a[i]);
            System.out.println();
        }

        //키값을 적어줌
        System.out.print("검색 값 : ");
        int k =sc.nextInt();

        int idx = seqSearchSen(a,num,k);

        if (idx==-1){
            System.out.println("검색결과 없습니다.");
        }else System.out.println(idx+"에 있습니다." );
    }
}
