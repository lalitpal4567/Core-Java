package javaClasses.objectClass;


class JbkJob implements Cloneable {
    String task1;
    String task2;
    String task3;

    public JbkJob(String task1, String task2, String task3) {
        this.task1 = task1;
        this.task2 = task2;
        this.task3 = task3;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return  "task1='" + task1 + '\'' +
                ", task2='" + task2 + '\'' +
                ", task3='" + task3 + '\'';
    }
}

class JbkEmployee implements Cloneable {
    int id;
    String name;
    JbkJob job;

    public JbkEmployee(int id, String name, JbkJob job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    // overriding clone() method to create a deep copy of an object.
    protected Object clone() throws CloneNotSupportedException {
        JbkEmployee employee = (JbkEmployee) super.clone();
        employee.job = (JbkJob) job.clone();
        return employee;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", job=" + job;
    }
}
public class JbkDeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        JbkJob dataentry = new JbkJob("Type", "Print", "Scan");
        JbkEmployee jbkemployee1 = new JbkEmployee(01, "John", dataentry);
        JbkEmployee jbkemployee2 = null;


        jbkemployee2 = (JbkEmployee) jbkemployee1.clone();
        jbkemployee1.job.task1 = "no task";

        System.out.println(jbkemployee1);
        System.out.println(jbkemployee2);

    }
}
