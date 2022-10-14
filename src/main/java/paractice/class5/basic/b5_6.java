package paractice.class5.basic;

import java.util.Scanner;

public class b5_6 {
    public static void main(String[] args) {


    String[] words={"television","computer","mouse","phone"};
    Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();

            for (int k = 0; k < question.length; k++) {
                int j = (int) (Math.random() * question.length);
                char tmp = question[i];
                question[i] = question[j];
                question[j] = tmp;
        }

            System.out.printf("Q%d. %s의 정답을 입력하세용>",i+1, new String(question));
            String answer = scanner.nextLine();

            if (words[i].equals(answer.trim())) {
                System.out.println("맞았습니다");
            }else{
                System.out.println("틀렸습니다");
            }
        }
    }
}
