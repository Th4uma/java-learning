public class a {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 202201);
        Student s2 = new Student("李四", "男", 202202);
        Student s3 = new Student("王五", "女", 202203, 19);
        Student s4 = new Student("周六", "女", 202204, 20, "信息管理与信息系统");

        System.out.println(s1.name + " " + s1.sex + " " + s1.sno + " " + s1.age + " " + s1.dep);
        System.out.println(s2.name + " " + s2.sex + " " + s2.sno + " " + s2.age + " " + s2.dep);
        System.out.println(s3.name + " " + s3.sex + " " + s3.sno + " " + s3.age + " " + s3.dep);
        System.out.println(s4.name + " " + s4.sex + " " + s4.sno + " " + s4.age + " " + s4.dep);
    }
}

