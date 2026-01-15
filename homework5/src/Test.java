class Tranceport {
    private int wheel;
    private int number;
    private String color;

    public Tranceport(int wheel,int number,String color){
        this.color=color;
        this.number=number;
        this.wheel=wheel;
    }

    public void run(){
        System.out.println("我在路上跑");
    }

    public void information (){
        System.out.println("车轮数："+wheel+" 限载人数："+number+" 颜色："+color);
    }
}
class Car extends Tranceport {
    public Car(String color){
        super(4,5,color);
    }

    @Override
    public void run(){
        System.out.println("我在路上跑");
        System.out.println("我是汽车，我必须行驶在机动车道上");
    }
}
class Bike extends Tranceport {
    public Bike(String color){
        super(2,1,color);
    }

    @Override
    public void run(){
        System.out.println("我在路上跑");
        System.out.println("我是自行车，我必须行驶在非机动车道上");
    }
}
public class Test {
    public static void main(String[] args) {
        Tranceport t1=new Tranceport(6,16,"blue");
        t1.run();
        t1.information();
        Car c1=new Car("red");
        c1.run();
        c1.information();
        Bike b1=new Bike("black");
        b1.run();
        b1.information();
    }
}
