class Employee {
    static int id=0;
    int eno;
    String name;
    String sex;

    public Employee(String name,String sex) {
        this.eno=++id;
        this.name=name;
        this.sex=sex;
    }

    public static void numOfEmp(){
        System.out.println("公司共有员工数量：" + id);
    }

    public void speak(){
        System.out.println("我是" + name + "，性别" + sex + "，我是公司第" + eno + "号职工");
        numOfEmp();
    }
}
public class a {
    public static void main(String[] args) {
        Employee e1 = new Employee("张三", "男");
        Employee e2 = new Employee("李四", "女");
        Employee e3 = new Employee("王五", "男");

        Employee.numOfEmp();
        e1.speak();
        e2.speak();
        e3.speak();
    }
}
