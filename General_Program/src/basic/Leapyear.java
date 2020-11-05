package basic;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter a year ::");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		if (year % 400 == 0 && year % 100 != 0 || year % 4 == 0) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("Not a leap year");
		}

	}
}
