import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char level = input.next().charAt(0);
        switch(level){
            case 'A' :
            System.out.print("非常棒！");break;
            case 'B' :
            System.out.print("很好!");break;
            case 'C' :
            System.out.print("您通过了");break;
            case 'D' :
            System.out.print("下次努力");break;

        }
        System.out.print("您的等级是");
        System.out.print(level);
    }
}
