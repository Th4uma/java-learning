import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age > 0 && age < 13) {
            System.out.println("儿童");
        } else if (age >= 13 && age < 19) {
            System.out.println("青少年");
        } else if (age >= 19 && age < 60) {
            System.out.println("成年人");
        } else if (age >= 60) {
            System.out.println("老年人");
        } else {
            System.out.println("错误");
        }
    }
}
