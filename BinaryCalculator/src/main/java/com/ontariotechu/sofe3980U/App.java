package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * Main program: The entry point of the program. The local time will be printed
	 * first,
	 * Then it will create two binary variables, add them and print the result.
	 *
	 * @param args: not used
	 */
	public static void main(String[] args) {

		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Binary binary1 = new Binary("00010001000");
		System.out.println("First binary number is " + binary1.getValue());
		Binary binary2 = new Binary("111000");
		System.out.println("Second binary number is " + binary2.getValue());
		Binary sum = Binary.add(binary1, binary2);
		System.out.println("Their summation is " + sum.getValue());
		System.out.println("1");
		Binary num1 = new Binary("1001");
		Binary num2 = new Binary("0110");
		System.out.println("2");
		Binary result1 = Binary.OR(num1, num2);
		System.out.println("3");
		Binary result2 = Binary.AND(num1, num2);
		System.out.println("4");
		Binary result3 = Binary.multiply(num1, num2);
		System.out.println("5");
		System.out.println("OR: " + result1.getValue());
		System.out.println("AND: " + result2.getValue());
		System.out.println("Multiply: " + result3.getValue());

	}
}
