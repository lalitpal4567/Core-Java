package nestedClass.staticInnerClass;

class Hospital{
    String hospitalName;
    Hospital(String hospitalName){
        this.hospitalName = hospitalName;
    }

    static class Rooms{
        int noOfBeds;
        static boolean isACAvailable;
        Rooms(int noOfBeds, boolean isACAvailable){
            this.noOfBeds = noOfBeds;
            Rooms.isACAvailable = isACAvailable;
        }
        public static void showInfo(){
            System.out.println(isACAvailable);
//            System.out.println(noOfBeds);       // compilation error
        }
    }
}
public class Ward {
    public static void main(String[] args) {
//        Hospital obj = new Hospital("Fortis");
//        Hospital.Rooms obj2 = new Hospital.Rooms(2, false);
        Hospital.Rooms.showInfo();
    }
}
