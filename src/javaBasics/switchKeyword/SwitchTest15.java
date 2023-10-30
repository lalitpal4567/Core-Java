package javaBasics.switchKeyword;


class SwitchTest15 {
    public static void main(String[] args) {

        int month = 1;
        int year = 2000;
        int numDays = 0;

        switch (month) {
            case 1,3,5,7,8,10,12:
                numDays = 31;
                break;

            case 4,6,9,11:
                numDays = 30;
                break;

            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;

            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = " + numDays);
    }
}

