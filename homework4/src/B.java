public class B {
    public static void swap(int x,int y) {
        System.out.println("交换前x，y的值为：" + "x="+ x + ", y=" + y);
        int sw=x;
        x=y;
        y=sw;
        System.out.println("交换后x，y的值为：" + "x="+ x + ", y=" + y);
    }
    public static void main(String[] args) {
        int a = 12, b = 30;
        System.out.println("a，b的值为： a=" + a + ", b=" + b);
        swap(a, b);
        System.out.println("a，b的值为： a=" + a + ", b=" + b);
    }
}
