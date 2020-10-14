public class YearCheck {


    public void showLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0)
            System.out.println(year + " is leap year");
        else if (year % 400 == 0)
            System.out.println(year + " is leap year");
        else
            System.out.println(year + " is not leap year");

    }

    public boolean isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        else if (year % 400 == 0)
            return true;
        else
            return false;
    }


    public void checkLeapYear() {
        if (isLeap(2000)) {
            System.out.println(" is leap year");
        } else {
            System.out.println(" is not leap year");
        }

    }


}
