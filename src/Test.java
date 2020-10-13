public class Test {

    public static void main(String[] args) {


        YearCheck year1 = new YearCheck(2012);
        year1.isLeap();


        YearCheck year2 = new YearCheck(2100);
        year2.isLeap();

        YearCheck year3 = new YearCheck(2000);
        year3.isLeap();


        YearCheck year4 = new YearCheck(1700);
        year4.isLeap();


        year1.CheckLeapYear();
        year2.CheckLeapYear();
        year3.CheckLeapYear();
        year4.CheckLeapYear();

    }
}
