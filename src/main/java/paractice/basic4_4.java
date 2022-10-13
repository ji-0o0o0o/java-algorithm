package paractice;

public class basic4_4 {
    public static void main(String[] args) {
        int sum =0;
        int count = 0;
        for (int i = 0; i <10 ; i++) {
            if (i%2!=0){
                i=i*(-1);
            }else{
                i=i;
            }
            sum+=i;

//            System.out.println(count);
            System.out.println(sum);
        }
    }
}
