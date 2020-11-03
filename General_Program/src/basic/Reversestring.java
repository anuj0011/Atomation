package basic;

public class Reversestring {

	public static void main(String[] args) {
		
		// Reverse a string in Java

				  String input = "reverse";
			      char[] try1 = input.toCharArray();
			      for (int i = try1.length-1;i >= 0; i--) System.out.print(try1[i]);
				
		// Reverse a string in Java using stringbuffer 
			      
			      String string = "abcdef";
			      String reverse = new StringBuffer(string).reverse().toString();
			      System.out.println("\nString before reverse: "+string);
			      System.out.println("String after reverse: "+reverse);
			}

}
