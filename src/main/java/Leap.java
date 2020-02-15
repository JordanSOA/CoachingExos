public class Leap {
    public boolean isLeapYear(int year) {
        Boolean numCalc4 = (0 == (year % 4));
        Boolean numCalc100 = (0 == (year % 100));
        Boolean cas2 = (0 == (year % 400));
        Boolean cas1 = (numCalc4 && (numCalc100 == false));
        return cas1 || cas2 ;
    }
}
