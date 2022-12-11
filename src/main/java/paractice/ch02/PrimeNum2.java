package paractice.ch02;
//앞에 나오는 작은 소수들로 나눠지지 않으면 소수
public class PrimeNum2 {
    public static void main(String[] args) {
        int cnt= 0;//나눗셈 횟수
        int ptr = 0;//찾은 소수의 개수
        int[] prime = new int[500];//수소를 저장하는 배열

        prime[ptr++]=2;

        for (int i = 3; i <1000 ; i+=2) {//홀수만 확인
            int j;
            for (j = 0; j < ptr; j++) {
                cnt++;
                if (i % prime[j] == 0) {
                    break;
                }
            }
            if (ptr == j) {
                prime[ptr++] = i;
            }
        }
            for (int k = 0; k <ptr ; k++) {
                System.out.println(prime[k]);
            }
            System.out.println("나눗셈한 회수: "+cnt);

        }
    }

