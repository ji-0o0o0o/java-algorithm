package paractice.class5.prac;

import java.util.Scanner;

//단어 위치 섞어서 보여주고 원래 단어 맞추기
public class Prac_06 {
    public static void main(String[] args) {
        String[] words = {"television","computer","mouse","phone"};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <words.length ; i++) {
            char[] question = words[i].toCharArray();
            //for문으로 한번 더 섞어준다
            for (int j = 0; j <question.length ; j++) {

                int k = (int) (Math.random() * question.length);

                char tmp = question[k];
                question[k] = question[j];
                question[j] = tmp;

            }

            System.out.printf("Q%d. %s의 정답을 입력하세요>",i+1, new String(question));

            String answer = sc.nextLine().trim();

            if (words[i].equals(answer)){
                System.out.printf("맞았습니다\n\n");
            }else {
                System.out.printf("틀렸습니다\n\n");
            }

        }
    }


}
