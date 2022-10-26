package paractice.class6;

public class practice_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);
        String str = s.info();
        System.out.println(str);
    }
    static class Student{
        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;
        int sum;
        int average;

        Student(String name, int ban, int no, int kor, int eng, int math) {
            this.name = name;
            this.ban = ban;
            this.no = no;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
        Student(String name, int ban, int no, int kor, int eng, int math,int sum,int average) {
            this.name = name;
            this.ban = ban;
            this.no = no;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.sum=kor+eng+math;
            this.average=sum/3;
        }
        String info() {
//            Student student = new Student()
//            return student;

//        }
            return null;
        }

    }
}
