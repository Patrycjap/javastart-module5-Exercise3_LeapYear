public class Test {

    public static void main(String[] args) {


        YearCheck year1 = new YearCheck(2012);
        year1.showIsLeap();


        YearCheck year2 = new YearCheck(2100);
        year2.showIsLeap();

        YearCheck year3 = new YearCheck(2000);
        year3.showIsLeap();


        YearCheck year4 = new YearCheck(1700);
        year4.showIsLeap();


        year1.checkLeapYear();
        year2.checkLeapYear();
        year3.checkLeapYear();
        year4.checkLeapYear();

    }
}
