interface Drawable {
    public abstract void draw();
}
class test implements Drawable{
    double width;
    public test(double width){
        this.width=width;
    }
    
    @Override
    public void draw(){
        System.out.println(width);
    }

    public double getArea(){
        return width*width;
    }
}
public class d {
    public static void main(String[] args) {
        test a =new test(23);
        a.draw();
        System.out.println(a.getArea());
    }
}
