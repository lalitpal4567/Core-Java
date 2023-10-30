package records;

public record Department(int deptID, String deptName) {
    static String deptHOD;
    static final String deptFloor = "first floor";  // must be initialized at the time of declaration

//    public Department(){    // compilation error
//        deptHOD = "Sachin";
//    }

//    public Department(int deptID, String deptName){
//        if(deptID < 0)
//            throw new IllegalArgumentException();
//        this.deptID = deptID;
//        this.deptName = deptName;
//        deptHOD = "Sachin";
////        deptFloor = "second floor"; // final can't be modified
//    }
    public Department{
        if(deptID < 0)
            throw new IllegalArgumentException();
        deptHOD = "sachin";
//        this.deptID = deptID;   // compilation error


    }

}
