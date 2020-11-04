package basic;

public class Palindrome {

	public static void main(String[] args) {
		int palin = 545;
		String z = String.valueOf(palin);  // value of integer into string
		String ispalin = new StringBuffer(z).reverse().toString();
		int b = Integer.parseInt(ispalin.toString()); // value of string to integer

		if (palin == b) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}

	}

}
