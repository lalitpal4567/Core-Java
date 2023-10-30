package records;

// Record is implicitly final, can't be extended
record Book(String title, String publisher){ }

//public class Library extends Book{  // final class can't be extended
//    Library(String title, String publisher) {
//        super(title, publisher);
//    }
//
//    public static void main(String[] args) {
//        Library obj = new Library("History", "RajNiwas");
//    }
//}
