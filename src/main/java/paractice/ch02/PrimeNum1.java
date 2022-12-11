package paractice.ch02;

//소수로 나열하기
class PrimeNum1 {
    public static void main(String[] args) {
        int cnt = 0;//나눗셈 횟수

        for (int i = 2; i <1000 ; i++) {
            int j;
            for (j = 2; j <i ; j++) {
                cnt++;
                if (i%j==0){
                    break;
                }
            }

            if (i==j){//한번도 안나눠지면 소수 확인
                System.out.println(i);
            }
        }
        System.out.println("나눗셈한 횟수: "+cnt);
    }
}
