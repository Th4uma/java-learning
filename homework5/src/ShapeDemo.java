interface Ishape1 {
    double area();
}
interface Ishape2 {
    double perimeter();
}
class Cycle implements Ishape1,Ishape2{
    double r;

    public Cycle(double r){
        this.r=r;
    }

    @Override
    public double area(){
        return Math.PI*r*r;
    }

    @Override
    public double perimeter(){
        return Math.PI*2*r;
    }
}

class Square implements Ishape1,Ishape2{
    double l;
    
    public Square(double l){
        this.l=l;
    }

    @Override
    public double area(){
        return l*l;
    }

    @Override
    public double perimeter(){
        return l*4;
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Cycle c=new Cycle(3.0);
        Square s =new Square(3.0);
        System.out.println("半径：" + c.r +" 面积：" + c.area() +" 周长：" + c.perimeter());
        System.out.println("边长：" + s.l +" 面积：" + s.area() +" 周长：" + s.perimeter());
}
}
