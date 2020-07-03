package com.company;

public class Main {

    public static void main(String[] args) {
	   float minFloatValue = Float.MIN_VALUE;
	   float maxFloatValue = Float.MAX_VALUE;
	   System.out.println("Float Min Value = "+minFloatValue);
	   System.out.println("Float Max Value = "+maxFloatValue);

	   double minDoubleValue = Double.MIN_VALUE;
	   double maxDoubleValue = Double.MAX_VALUE;
	   System.out.println("Double Min Value = "+minDoubleValue);
	   System.out.println("Double Max Value = "+maxDoubleValue);

	   int intNum = 5/3;
	   float floatNum = 5f/3f;
	   double doubleNum = 5d/3d;
		System.out.println(intNum);
		System.out.println(floatNum);
		System.out.println(doubleNum);

		double pounds = 200d;
		double kg = pounds * 0.45359237d;
		System.out.println(kg);
	}
}
