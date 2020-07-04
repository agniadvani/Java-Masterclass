public class PossitiveNegativeZero {
    public static void main(String[] args){
        checkNumber(-20);
    }

    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("Number is possitive");
        } else if (number < 0){
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
