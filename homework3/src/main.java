class d {
    String country;
    int age;
    int grade;

    d(String country,int age){
        this.age=age;
        this.country=country;
    }

    d(String country,int age,int grade){
        this.age=age;
        this.country=country;
        this.grade=grade;
    }
}
public class main {
    public static void main(String[] args) {
        d s1 = new d("China", 20);
        d s2 = new d("China", 21 , 3);
        System.out.println(s1.country + " " + s1.age + " " + s1.grade );
        System.out.println(s2.country + " " + s2.age + " " + s2.grade );
    }
}

