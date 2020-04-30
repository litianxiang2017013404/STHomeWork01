import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Admin {
private static List data;
public static void main(String[] args) {
636f70797a6431333264646536init();
Scanner in = new Scanner(System.in);
while (true) {
System.out.print("学生列表,请输入1 ");
System.out.print("查找列表,请输入2 ");
System.out.print("添加学生,请输入3 ");
System.out.print("删除学生,请输入4 ");
System.out.println("退出,请输入5");
int i = in.nextInt();
if (i == 1) {
list();
} else if (i == 2) {
find();
} else if (i == 3) {
add();
} else if (i == 4) {
del();
} else if (i == 5) {
System.out.println("您已退出系统!");
System.exit(0);
}
System.out.println("-------------------------------------------");
}
}
private static void del() {
Scanner in = new Scanner(System.in);
System.out.print("输入学号:");
String id = in.next();
boolean flg = false;
for (int i = 0; i < data.size(); i++) {
Student s = (Student) data.get(i);
if (s.getId().equalsIgnoreCase(id)) {
data.remove(i);
flg = true;
}
}
if (!flg) {
System.out.println("没有该学生!");
}
}
private static void add() {
Scanner in = new Scanner(System.in);
System.out.print("输入学号:");
String id = in.next();
System.out.print("输入姓名:");
String name = in.next();
System.out.print("输入性别:");
String sex = in.next();
Student s = new Student();
s.setId(id);
s.setName(name);
s.setSex(sex);
data.add(s);
}
private static void find() {
Scanner in = new Scanner(System.in);
System.out.print("输入关键字:");
String key = in.next();
for (int i = 0; i < data.size(); i++) {
Student s = (Student) data.get(i);
if (s.getId().equalsIgnoreCase(key)) {
System.out.println(s);
break;
}
if (s.getName().equalsIgnoreCase(key)) {
System.out.println(s);
break;
}
if (s.getSex().equalsIgnoreCase(key)) {
System.out.println(s);
break;
}
}
}
private static void list() {
if (data == null || data.size() == 0) {
System.out.println("当前没有数据!");
return;
}
for (int i = 0; i < data.size(); i++) {
System.out.println(data.get(i));
}
}
private static void init() {
if (data == null) {
data = new ArrayList();
}
}
}
class StudentManager{
private String id;
private String name;
private String sex;
public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getSex() {
return sex;
}
public void setSex(String sex) {
this.sex = sex;
}
public String toString() {
return "ID:" + id + " 名称:" + name + " 性别" + sex;
}
}