class Student {
    String name;
    String sex;
    int sno;
    int age;
    String dep="信息管理与信息系统";

    Student(String name, int sno) {
        this.name = name;
        this.sno = sno;
    }

    Student(String name, String sex, int sno) {
        this.name = name;
        this.sex = sex;
        this.sno = sno;
    }

    Student(String name, String sex, int sno, int age) {
        this.name = name;
        this.sex = sex;
        this.sno = sno;
        this.age = age;
    }

    Student(String name, String sex, int sno, int age, String dep) {
        this.name = name;
        this.sex = sex;
        this.sno = sno;
        this.age = age;
        this.dep = dep;
    }

    Student(){
        
    }
}