package paractice.class5.prac;
//배열 arr에 담긴 모든 값 더하기


public class Prac_03 {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        int sum=0;
        //배열 arr를 하나씩 꺼내서 sum에 더해준다.
        for (int k : arr) {
            sum += k;
        }

        System.out.println("sum: "+sum);
    }

}
