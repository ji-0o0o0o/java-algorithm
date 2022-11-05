package paractice.class5.example;

//각 과목별 점수, 총합, 평균
public class 이차원_배열의_초기화_2 {
    public static void main(String[] args) {
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };
        int korTotal = 0, engTotal = 0, mathTotal=0;

        System.out.println("번호  국어  영어  수학  총점  평균 ");
        System.out.println("=============================");

        for (int i = 0; i < score.length ; i++) {
            int sum =0; //개인별 총점
            float avg = 0;//개인별 평균

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%2d",i+1); //%2 -> 두칸 띄어줌

            //각 과목의 score 적어줌
            for (int j = 0; j <score[i].length ; j++) {
                sum+=score[i][j];
                System.out.printf("%5d",score[i][j]);
            }
            //평균계산
            avg = sum/(float)score[i].length;
            //평균,합산 적어줌
            System.out.printf("%5d %5.1f\n",sum,avg);

        }
        System.out.println("=============================");
        System.out.printf("총점: %3d %4d %4d\n",korTotal,engTotal,mathTotal);
        //1. 먼저 score[0][]번째 자리를 먼저 채워준다
        //2. 그 후 순차적으로 오게 반복해준다.
    }
}

