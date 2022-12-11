package paractice.ch02;

public class ArraySumForIn {
    public static void main(String[] args) {
        double[] a = {1.0,2.0,3.0,4.0,5.0};

        for (int i = 0; i <a.length ; i++) {
            System.out.printf("a[%d] = %.2f\n",i,a[i]);
        }
        double sum = 0;
        for(double j :a){
            sum+=j;
        }
        System.out.printf("모든 요소 합은 %.1f",sum);

    }
}
