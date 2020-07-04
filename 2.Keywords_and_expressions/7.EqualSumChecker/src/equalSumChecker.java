public class equalSumChecker {
    
    public static String equalSumCheck(int a, int b, int c, int d) {
        // checking (a+b = c+d)

        if ((a + b) == (c + d)) {
            return "These numbers have the equal sums";
        }
        return "These numbers have different sums";
    }
}
