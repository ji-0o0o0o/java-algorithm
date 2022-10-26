package paractice.class7;

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price= price;
        bonusPoint =(int) (price/10.0);
    }
}
class Tv extends Product{
    Tv(){
        super(10);
    }
    //자동적으로 super() 생성 하지만 super()와 상응하는 product기본생성자가 없기때문에
    // product기본생성자를 생성하거나 매개변수 있는 생성자를 지정해준다
    public String toString(){
        return  "Tv";
    }
}

public class Prac_3 {
    public static void main(String[] args) {
        Tv t = new Tv() ;
    }
}

