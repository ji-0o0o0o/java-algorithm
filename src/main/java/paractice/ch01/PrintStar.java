package paractice.ch01;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,w;

        System.out.println("*를 n개 출력하되 w개 마다 줄을 바꿔서 출력");

        do{
            System.out.print("n= ");n= sc.nextInt();
        }while (n<=0);//n이 양수가 나오면 반복을 그만함

        do {
            System.out.print("w= ");w=sc.nextInt();
        }while (w<=0||w>n);//w가 양수이고 n보다 작아야됨

//        for (int i =

        for (int i = 0; i <n/w ; i++) {
            System.out.println("*".repeat(w));
        }

        if(n%w!=0){
            System.out.println("*".repeat(n%w));//repeat로 반복될 문자를 가져옴
        }

    }
}
