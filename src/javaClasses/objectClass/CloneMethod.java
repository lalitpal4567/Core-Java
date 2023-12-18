package javaClasses.objectClass;

public class CloneMethod implements Cloneable{
    String bookTitle;
    CloneMethod(String title){
        this.bookTitle = title;
    }

    public void setTitle(String title){
        this.bookTitle = title;
    }

    @Override
    public String toString() {
        return "bookTitle='" + bookTitle + '\'';
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneMethod book1 = new CloneMethod("Maths");


        CloneMethod book2 = (CloneMethod) book1.clone();

        book1.setTitle("English");
        System.out.println(book1);
        System.out.println(book2);


    }
}
