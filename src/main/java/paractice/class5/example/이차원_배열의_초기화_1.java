package paractice.class5.example;

public class 이차원_배열의_초기화_1 {
    public static void main(String[] args) {
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40}
        };
        int sum=0;
        for (int i = 0; i <score.length ; i++) {
            for (int j = 0; j <score[i].length ; j++) {
                System.out.printf("score[%d][%d]=%d\n",i,j,score[i][j]);
                sum+=score[i][j];
            }

        }
        System.out.printf("sum = %d",sum);
    }
}

