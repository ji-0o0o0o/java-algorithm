package paractice.ch02;

public class PrimeNum3 {
    public static void main(String[] args) {
        int cnt=0;
        int ptr =0;
        int[] prime = new int[500];

        prime[ptr++]=2;
        prime[ptr++]=3;

        for (int n = 5; n <1000 ; n+=2) {//홀수만 조사 , 짝수는 2로 무조건 나눠져서 소수가 아니다
            boolean flag = false;
            for (int i = 0; prime[i] * prime[i] <= n; i++) {
                // prime[i]*prime[i]<=n
                //n제곱근 이하의 어떤 소수로도 나누어떨어지지 않습니다.
                cnt += 2;// prime[i]*prime[i]<=n와 n%prime[i] 계산한거 더해주기
                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                //이때까지 flase면 소수이니까 prime에 저장
                prime[ptr++] = n;
                cnt++;
            }
        }
            for (int i = 0; i <ptr ; i++) {
                System.out.println(prime[i]);
            }


        System.out.println("곱셈과 나눗셈한 횟수는 : "+cnt);
    }
}
