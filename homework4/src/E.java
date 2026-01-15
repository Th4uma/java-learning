class Compute {
    static final double pi=3.14;
    float x,y;
    public Compute(float x,float y){
        this.x=x;
        this.y=y;
    }
    public static double circumference(double r){
        return 2*pi*r;
    }
    public void add(){
        System.out.println("x+y="+(x+y));
    }
    public void sub(){
        System.out.println("x-y="+(x-y));
    }
    public void mul(){
        System.out.println("x*y="+(x*y));
    }
    public void div(){
        System.out.println("x/y="+(x/y));
    }
}
public class E {
    public static void main(String[] args) {
        double a=Compute.circumference(10);
        System.out.println("圆的周长为："+a);
        Compute c=new Compute(2,3);
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
