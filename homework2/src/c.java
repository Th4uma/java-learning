import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        int max = 0;
        int used = -1;
        int[] a = {1,4,6,2,8,3,5,9,7};
        int[] b = new int [9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
            if(a[j]>max){
                max=a[j];
                used=j;
            }
        }
        b[i]=max;
        max=0;
        a[used]=0;
        }
        for(int i : b){
        System.out.print(i);
        }
    }
}
