public class Student {
    private String name;
    private double grade;
    public Student() {
    }
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
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
