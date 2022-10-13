package paractice;

public class basic4_7 {
    public static void main(String[] args) {
        String str ="12345";
        int sum = 0;
        for (int i = 0; i <str.length() ; i++) {
            int a =Integer.parseInt(str);
            sum+=a%10;
            a/=10;
            System.out.println(sum);
            System.out.println(a);
        }

    }
}
