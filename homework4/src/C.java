public class C {
    public void changeName(Employee e1, String n){
        System.out.println("e1的姓名为："+ e1.name);
        e1.name=n;
        System.out.println("e1的姓名为："+ e1.name);
    }
    public static void main(String[] args) {
        Employee e=new Employee("赵一", "女");
        System.out.println("e的姓名为："+ e.name);
        C c = new C();
        c.changeName(e,"赵依依");
        System.out.println("e的姓名为："+ e.name);
    }
}

