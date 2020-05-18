public class Student {
    private String name;
    private double grade;
    public Student() {
    }
    public Student(String name, double grade) {
        this.name = name;                   //3//
        this.grade = grade;
    }
    public String getName() {
        return name;                        //3//
    }
    public void setName(String name) {
        this.name = name;                   //3//
    }
    public double getGrade() {
        return grade;                       //3//
    }
    public void setGrade(double grade) {
        this.grade = grade;                 //3//
    }
}

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("11");
        stu1.setGrade(99);
        Student stu2 = new Student("12",88);
    }
}
