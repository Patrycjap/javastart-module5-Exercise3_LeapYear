public class Test {

    public static void main(String[] args) {


        YearCheck year = new YearCheck();


        year.showLeap(2012);
        year.showLeap(2100);
        year.showLeap(2000);
        year.showLeap(1700);


        System.out.println("Leap year: " + year.isLeap(2012));
        System.out.println("Leap year: " + year.isLeap(2100));
        System.out.println("Leap year: " + year.isLeap(2000));
        System.out.println("Leap year: " + year.isLeap(1700));


    }
}
