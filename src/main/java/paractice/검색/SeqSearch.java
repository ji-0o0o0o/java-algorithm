package paractice.검색;

import java.util.Scanner;

//선형검색
class SeqSearch {
    static int seqSearch(int[] a, int n , int key){
        int i=0;

        while (true){
            if (i==n){
                return -1;//검색 실패
            }
            if (a[i]==key){
                return 1;//검색 성공
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수: ");
        int num =sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i <num ; i++) {
            System.out.print("x["+i+"]: ");
            x[i]=sc.nextInt();
        }

        System.out.print("검색한 값은: ");
        int ky = sc.nextInt();

        int idx = seqSearch(x,num,ky);

        if(idx==-1){
            System.out.println("그 값은 요소값 아님니다");
        }else{
            System.out.println("그 값은 x["+idx+"]에 있습니다");
        }


    }
}
