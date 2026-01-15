import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        //1
        double[] A = new double[3];
        double[] B = new double[5];
        char[] C = new char[1];
        boolean[] D = new boolean[2];
        //2 [D表示double类型，@5caf905d是内存地址
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(A[0]);
        System.out.println(B[0]);
        System.out.println(C[0]);
        System.out.println(D[0]);
        //3
        A[0] = 2.5; A[1] = 3.6; A[2] = 5.8;
        B[0] = 100.5; B[1] = 56; B[2] = 98; B[3] = 43.2; B[4] = 71.6;
        //4
        for (double a : A) System.out.print(a + " ");
        for (double b : B) System.out.print(b + " ");
        //5
        A = B;
        //6
        B[1] = 4;
        //7 A=B执行后，A和B的引用地址相同，说明它们指向同一块内存
        System.out.println(A);
        System.out.println(B);
        //8 AB内容相同，因为共享同一数组对象
        for (double a : A) System.out.print(a + " ");
        for (double b : B) System.out.print(b + " ");
    }
}
