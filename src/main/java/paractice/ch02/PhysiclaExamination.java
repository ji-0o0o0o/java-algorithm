package paractice.ch02;

import java.util.Scanner;

public class PhysiclaExamination {

    static final int VMAX = 21; //시력분포 나타냄

    static class PhyscData{
        String name;
        int height;
        double vision; //시력

        //생성자

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }
    //키의 평균 구함
    static double aveHeight(PhyscData[] dat){
        double sum =0;

        for (int i = 0; i <dat.length ; i++) {
            sum+=dat[i].height;
        }
        return sum/dat.length;
    }

    //시력분포 구함
    static void disVision(PhyscData[] dat, int[] dist){
        int i =0;
        dist[i]=0;
        for (i = 0; i <dat.length ; i++) {
            if (dat[i].vision>=0&&dat[i].vision<=VMAX/10.0){
                dist[(int) (dat[i].vision*10)]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x ={
                new PhyscData("강민하",162,0.3),
                new PhyscData("김찬우",174,.7),
                new PhyscData("박준서",175,2.0),
                new PhyscData("유서범",171,1.5),
                new PhyscData("유수연",168,.4),
                new PhyscData("장경오",174,1.2),
                new PhyscData("황지안",169,.8),
        };
        int[] vdist = new int[VMAX];

        System.out.println("@ 신체검사 리스트 @");
        System.out.println("이름     키     시력");
        System.out.println("-----------------");
        for (int i = 0; i <x.length ; i++) {
            System.out.printf("%-6s%3d%7.1f\n",x[i].name,x[i].height,x[i].vision);
        }
        System.out.printf("\n평균 키: %5.1fcm\n",aveHeight(x) );
        disVision(x,vdist);

        System.out.println("\n시력 분포");
        //시력분포도 사람 숫자로
//        for (int i = 0; i < VMAX; i++) {
//            System.out.printf("%3.1f~ : %2d명\n",i/10.0,vdist[i]);
//
//        }
        //시력분포도 *로 나오게
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~ : ",i/10.0);
            for (int j = 0; j <vdist[i] ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
