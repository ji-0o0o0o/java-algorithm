package paractice;

public class basic4_10 {
    public static void main(String[] args) {
       int answer = (int)(Math.random()*100)+1;
       int input=0;
       int count=0;

       java.util.Scanner s = new java.util.Scanner(System.in);

       do{
           count++;
           System.out.println("1~100:");
           input = s.nextInt();
           if(answer==input){
               System.out.println("맞혔습니다");
               System.out.printf("시도횟수는 %d 입니다",count);
               break;
           } else if (answer>input) {
               System.out.println("더 큰 수를 입력하세요");
           }else {
               System.out.println("더 작은 수를 입력하세요");

           }
       }while(true);

    }
}
