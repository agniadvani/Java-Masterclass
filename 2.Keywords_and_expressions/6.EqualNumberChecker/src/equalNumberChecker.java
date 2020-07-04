public class equalNumberChecker {

    public static String teenNumberChecker(int age) {
        if ((age > 12) && (age < 20)) {
            return "You're a teenager";
        } else if (age > 19) {
            return "you're an adult";
        } else {
            return "You're a child";
        }
    }
}
