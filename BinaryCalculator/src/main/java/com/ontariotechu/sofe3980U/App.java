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

		// DESIGN QUESTIONS

		// Construct Binary objects
		Binary bin1 = new Binary("1001001");
		Binary bin2 = new Binary("0110110");

		// Apply operations to binary objects
		Binary orRes = Binary.OR(bin1, bin2);
		Binary andRes = Binary.AND(bin1, bin2);
		Binary mulRes = Binary.multiply(bin1, bin2);

		// Print results
		System.out.println("/n Design Questions /n");
		System.out.println("The following operations will be done on " + bin1.getValue() + " and " + bin2.getValue());
		System.out.println("Bitwise OR operation result: " + orRes.getValue());
		System.out.println("Bitwise AND operation result:" + andRes.getValue());
		System.out.println("Bitwise MULTIPLICATION operation result:" + mulRes.getValue());

	}
}
