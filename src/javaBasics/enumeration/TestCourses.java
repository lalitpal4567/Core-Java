package javaBasics.enumeration;
enum Course { JAVA, C, CPP, PYTHON, HTML, CSS, SPRING, NODE_JS, REACT_JS, ANGULAR_JS, ADVANCE_JAVA, DOM, SOM, C_HASH, J_QUERY }
public class TestCourses {

    public static void main(String[] args) {
        for(Course c : Course.values()) {
            System.out.println(c);
        }
    }
}
