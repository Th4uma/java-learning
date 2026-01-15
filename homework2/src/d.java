public class d {
    public static void main(String[] args) {
        int a=0,ans=0;
        while(a<=100){
            a++;
            if(a%2==0) continue;
            ans+=a;
        }
        System.out.println(ans);
    }
}
