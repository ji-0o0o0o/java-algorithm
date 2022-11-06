package paractice.class5.example;

import java.util.Scanner;

public class 이차원_배열의_초기화_3 {
    public static void main(String[] args) {
        String[][] word={
                {"chair","의자"},
                {"computer","컴퓨터"},
                {"integer","정수"}

        };
        //scanner 생성
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < word.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? ",i+1, word[i][0]);

            //String으로 받아오기
            String tmp = sc.nextLine();

            if (tmp.equals(word[i][1])){
                System.out.println("정답입니다");
                System.out.println();
            }else {
                //틀렸으면 정답을 알려줌
                System.out.printf("틀렸습니다. %s입니다\n\n",word[i][1]);
            }
        }
        
        
    }
}
