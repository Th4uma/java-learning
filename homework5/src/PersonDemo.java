abstract class Person{
    private String name;
    public Person(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void getDescription();
}
class Student extends Person{
    private String school; 

    public Student(String name,String school){
        super(name);
        this.school=school;

    }
    @Override
    public void getDescription(){
        System.out.println("在"+school+"学院上学的学生");
    }

}
class Employee extends Person{
    private String department; 
    public Employee(String name,String department){
        super(name);
        this.department=department;

    }
    @Override
    public void getDescription(){
        System.out.println("在"+department+"部门工作的职工");
    }
}
public class PersonDemo {
    public void introduce(Person p){
        System.out.println(p.getName());
        p.getDescription();
    }
    public static void main(String[] args) {
        Person p = new Employee("Tom", "销售部");
        p.getDescription();
        PersonDemo d=new PersonDemo();
        Person e = new Employee("王五", "信息部");
        Person s = new Student("李明", "管理学院");
        d.introduce(e);
        d.introduce(s);
    }
}
