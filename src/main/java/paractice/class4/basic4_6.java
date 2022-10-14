package paractice.class4;

public class basic4_6 {
    public static void main(String[] args) {
        int sum =0;
        int count = 0;
        for (int i = 0; i <6 ; i++) {
            for (int j = 1; j < 6; j++) {
                if(i+j==6){
                    System.out.printf("%d+%d = %d" ,i,j,i+j );
                    System.out.println();
                }
            }
        }

    }
}
