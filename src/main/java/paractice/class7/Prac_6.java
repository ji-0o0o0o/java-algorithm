package paractice.class7;

class Outer6{
    class Inner{
        int iv =100;
    }
}
public class Prac_6 {
    public static void main(String[] args) {
        Outer6 oc = new Outer6();
        Outer6.Inner inner = oc.new Inner();
        System.out.println(inner.iv);

    }
}
