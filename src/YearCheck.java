public class YearCheck {
    private int year;

    public YearCheck(int year) {
        this.year = year;
    }

    public void isLeap() {
        if (year % 4 == 0 && year % 100 != 0)
            System.out.println(year + " is leap year");
        else if (year % 400 == 0)
            System.out.println(year + " is leap year");
        else
            System.out.println(year + " is not leap year");

    }

    public boolean isLeap2() {
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        else if (year % 400 == 0)
            return true;
        else
            return false;
    }


    void CheckLeapYear() {
        if (isLeap2()) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }

    }


}
