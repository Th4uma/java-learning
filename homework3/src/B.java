public class B {
    public static void main(String[] args) {
        Student st1 = new Student();

        st1.name = "钱七";
        st1.sex = "男";
        st1.sno = 2020001;
        st1.age = 22;
        st1.dep = "电子商务";

        Student st2 = new Student("赵八", "女", 2020002, 20);

        System.out.println(st1.name + " " + st1.sex + " " + st1.sno + " " + st1.age + " " + st1.dep);
        System.out.println(st2.name + " " + st2.sex + " " + st2.sno + " " + st2.age + " " + st2.dep);
    }
}
