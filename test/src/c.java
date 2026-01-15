interface Shape{
    public abstract double getArea();
    public abstract double getPerimeter();
}
class Rectangle implements Shape{
    double width;
    double height;

    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea(){
        return height*width;
    }

    @Override
    public double getPerimeter(){
        return (height+width)*2;
    }
}
public class c {
    public static void main(String[] args) {
        Rectangle a=new Rectangle(12, 14);
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
    }
}
