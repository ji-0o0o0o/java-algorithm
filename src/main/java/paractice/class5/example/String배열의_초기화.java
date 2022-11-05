package paractice.class5.example;

public class String배열의_초기화 {
    public static void main(String[] args) {
        String[] names = {"kim","Part","Yi"};

        //각 자리에 어떤 글자 들어가 있는지 확인
        for (int i = 0; i <names.length ; i++) {
            System.out.println("names["+i+"]="+ names[i]);
        }

        String tmp = names[2];//names의 3번째 요소 Tmp에 저장
        System.out.println("tmp=" +tmp);
        names[0]="yu";//첫번째 자리에 yu대입

        //순서대로 어떤 글자 들어있는지 출력
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //tmp에 값을 저장해도 3번째 요소는 변경되지 않음
        //배열의 각 요소에 문자열 지정하면 이전에 값에 새로운 값이 덮여짐
        //->문자열 변경할 수 없으므로 새로운 내용의 문자열이 생기는 것이다.
    }
}
