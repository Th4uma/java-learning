class Student{
   String name;
   double score;
   String school="XX中学";
   
   Student(String name,double score,String school){
        this.name=name;
        this.score=score;
        this.school=school;
   }
   void showSchool(){
        System.out.println(school);
   }
   void showScore(){
        System.out.println(name+" "+score);
   }
}

public class b {
    public static void main(String[] args) {
            Student a=new Student("1",12,"中学");
            a.showSchool();
            a.showScore();
    }
}
