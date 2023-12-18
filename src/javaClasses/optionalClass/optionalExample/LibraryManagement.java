package javaClasses.optionalClass.optionalExample;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Student{
    private String name;
    private int rollNo;
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public String getName(){
        return this.name;
    }
    public int getRollNo(){
        return this.rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
class Library{
    private String name;
    private ArrayList<Student> students;
    Library(String name){
        this.name = name;
        students = new ArrayList<>();
    }
    public void addStudents(String name, int rollNo){
        students.add(new Student(name, rollNo));
    }
    public Optional<Student> searchStudent(int rollNo){
        Optional<Student> student = students.stream()
                .filter(stu -> stu.getRollNo() == rollNo)
                .findFirst();

        return student;
    }
}
public class LibraryManagement {
    public static Student generateDefaultValue(){
        return new Student("UNKNOWN", 0000);
    }
    public static void main(String[] args) {
        Library obj = new Library("IPU");
        obj.addStudents("Sachin", 1002);
        obj.addStudents("Lalit", 1004);
        obj.addStudents("Aman", 1005);
        obj.addStudents("Shekhar", 1006);
        obj.addStudents("Raj", 1007);

        Optional<Student> student = obj.searchStudent(1000);

//        if(student.isPresent())
//            System.out.println(student.get());
//        else System.out.println("not found");

//        ------------------------------------------------------

//        Student stu = student.orElse(new Student("UNKNOWN", 0000));
//        System.out.println(stu);

//        ------------------------------------------------------
//        student.ifPresent(value -> System.out.println(value));

//        ------------------------------------------------------

        Student stu2 = student.orElseGet(() -> generateDefaultValue());
        System.out.println(stu2);

    }
}
