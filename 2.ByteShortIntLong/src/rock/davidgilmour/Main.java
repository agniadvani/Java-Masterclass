package rock.davidgilmour;

public class Main {

    public static void main(String[] args) {
    int intMaxValue = Integer.MAX_VALUE;
    int intMinValue = Integer.MIN_VALUE;
    System.out.println("Maximum Value in int = "+intMaxValue);
    System.out.println("Minimum Value in int = "+intMinValue);
    System.out.println("Busted Max Value = " + (intMaxValue + 1));
    System.out.println("Busted Min Value = " + (intMinValue - 1));

    byte byteMaxValue = Byte.MAX_VALUE;
    byte byteMinValue = Byte.MIN_VALUE;
    System.out.println("Maximum Value in byte = "+byteMaxValue);
    System.out.println("Minimum Value in byte = "+byteMinValue);
    
    short ShortMaxValue = Short.MAX_VALUE;
    short ShortMinValue = Short.MIN_VALUE;
    System.out.println("Maximum Value in short = "+ShortMaxValue);
    System.out.println("Minimum Value in short = "+ShortMinValue);

    long myLongValue = 100L;
    System.out.println(myLongValue);
    long LongMaxValue = Long.MAX_VALUE;
    long LongMinValue = Long.MIN_VALUE;
    System.out.println("Maximum Value in long = "+LongMaxValue);
    System.out.println("Minimum Value in long = "+LongMinValue);

    byte myByteValue = (byte) (byteMinValue/2);

    short myShortValue = (short) (ShortMinValue/2);
    System.out.println(myByteValue);
    System.out.println(myShortValue);

    }
}