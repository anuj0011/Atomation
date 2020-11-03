package basic;

import java.util.regex.Pattern;

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
		
		// Reverse words in a given String in Java
			      
			      String str = "i am anuj bansal";
					Pattern p = Pattern.compile("\\s");
					String[] temp = p.split(str);
					String rev = " ";
					
					for (int i = 0; i < temp.length; i++) {
						if (i == temp.length - 1) {
							rev = temp[i] + rev;
						} else {
							rev = " " + temp[i] + rev;
						}
						System.out.println("The reversed string is: " + rev);

					}
	}

}
