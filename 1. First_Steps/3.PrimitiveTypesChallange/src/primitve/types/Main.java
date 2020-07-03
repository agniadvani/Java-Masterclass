package primitve.types;

public class Main {

    public static void main(String[] args) {
        byte byteNumber = 123;
        short shortNumber = 12345;
        int intNumber = 1234567;
        long longNumber = (50000+(10*(byteNumber+intNumber+shortNumber)));
        System.out.println(longNumber);
    }
}
