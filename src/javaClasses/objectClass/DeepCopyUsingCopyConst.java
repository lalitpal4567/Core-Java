package javaClasses.objectClass;

class Student{
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    private Student(Student stu){
        this.name = stu.name;
        this.age = stu.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public Student deepCopy(){
        return new Student(this);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}

public class DeepCopyUsingCopyConst {
    public static void main(String[] args) {
        Student s1 = new Student("Sachin", 24);
//        System.out.println(s1);

        Student s2 = s1.deepCopy();
//        System.out.println(s2);

        s1.setName("Lalit");
        System.out.println(s1);

        System.out.println(s2);
    }
}
