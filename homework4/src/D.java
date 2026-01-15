public class d {
    public void changeName(Employee e1, String n){
        e1 =new Employee("孙武", "男");
        System.out.println("e1的姓名为："+ e1.name);
        e1.name=n;
        System.out.println("e1的姓名为："+ e1.name);
    }
    public static void main(String[] args) {
        Employee e=new Employee("赵一", "女");
        System.out.println("e的姓名为："+ e.name);
        d d = new d();
        d.changeName(e,"赵依依");
        System.out.println("e的姓名为："+ e.name);
    }
}

