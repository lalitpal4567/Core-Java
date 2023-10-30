package javaBasics.switchKeyword;

public class SwitchTrick {
    enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
    private DayOfWeek getWeekDay(int day, final int thursday) {
            int otherDay = day;
            int Sunday = 0;
            switch(otherDay) {
                   default:
//                       case 1: continue;
//                       case thursday: return DayOfWeek.THURSDAY;
                   case 2,10: break;
//                   case Sunday: return DayOfWeek.SUNDAY;  // compilation error
//                   case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;    // compilation error
            }
            return DayOfWeek.FRIDAY;
         }
    public static void main(String[] args) {
        SwitchTrick obj = new SwitchTrick();
        obj.getWeekDay(1,4);
    }
}
