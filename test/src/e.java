import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        int a=0,max=0,min=1000000000,add=0;
        Scanner input = new Scanner(System.in);
        for (int i=1;i<=10;i++){
            a=input.nextInt();
            if(a>max){
                max=a;
            }
            if(a<min){
                min=a;
            }
            add+=a;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(add/10);
    }
}
