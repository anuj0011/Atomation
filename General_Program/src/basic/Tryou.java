package basic;

public class Tryou {

	public static void main(String[] args) {
		int palin = 121;
		String z = String.valueOf(palin);
		String ispalin = new StringBuffer(z).reverse().toString();
		int b = Integer.parseInt(ispalin.toString());
		
		if(palin == b) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}

}
