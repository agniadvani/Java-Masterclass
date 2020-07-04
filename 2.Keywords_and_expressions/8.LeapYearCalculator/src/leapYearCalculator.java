public class leapYearCalculator {
    
    public static String isLeapYear(int year) {
        //1800, 1900, 2100, 2200 and 2300
        if (year == 1800 || year == 1900 || year == 2100 || year == 2200 || year == 2300) {
            return "This year was not a leap year";
        } else if (year % 4 == 0) {
            return "This year was a leap year";
        }
        return "This year was not a leap year";
    }
}
