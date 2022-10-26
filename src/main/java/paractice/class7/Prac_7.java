package paractice.class7;

class Outer7{
    static class Inner{
        int iv =200;
    }
}
public class Prac_7 {
    public static void main(String[] args) {
        Outer7.Inner inner = new Outer7.Inner();
        System.out.println(inner.iv);
    }
}
