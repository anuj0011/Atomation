package basic;

public class Pyramid {

	public static void main(String[] args) {

// Right Triangle Star Pattern 

		// i for rows and j for columns
		// row denotes the number of rows you want to print
		int i, j, row = 6;
		
		// outer loop for rows
		for (i = 0; i < row; i++) {
			
			// inner loop for columns
			for (j = 0; j <= i; j++) {
				
				// prints stars
				System.out.print("* ");
			}
			
			// throws the cursor in a new line after printing each line
			System.out.println();
		}

// Pyramid Star Pattern

		// ii for rows and jj for columns
		// rrow denotes the number of rows you want to print
		
		
		// Outer loop work for rows
		for (i = 0; i < row; i++) {
			
			// inner loop work for space
			for (j = row - i; j > 1; j--) {
				
				// prints space between two stars
				System.out.print(" ");
			}
			
			// inner loop for columns
			for (j = 0; j <= i; j++) {
				
				// prints star
				System.out.print("* ");
			}
			
			// throws the cursor in a new line after printing each line
			System.out.println();
		}
	}

}
