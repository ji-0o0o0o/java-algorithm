package paractice.ch02;

//소수로 나열하기
class PrimeNum1 {
    public static void main(String[] args) {
        int cnt = 0;//나눗셈 횟수

        for (int n = 2; n <=1000 ; n++) {
//            int i;
            for (int i = 2; i <n ; i++) {
                cnt++;
                if (n%i==0){//나누어 떨어지면 소수가 아니므로 종료
                    break;
                }
                if (n==i){//마자믹까지 나누어 떨어지지 않음
                    System.out.println(n);
                }

            }
        }
        System.out.println("나눗셈한 횟수: "+cnt);
    }
}
