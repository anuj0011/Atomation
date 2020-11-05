package basic;

public class Factorial {

	public static void main(String[] args) {
		int num = 6;
		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact = i * fact;
		}
		System.out.println("Factorial of given no. is " +fact);
	}

}
