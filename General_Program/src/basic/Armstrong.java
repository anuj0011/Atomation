package basic;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153;
		int total = 0;
		String z = String.valueOf(num);
		String[] temp = z.split("");

		for (int i = 0; i < temp.length; i++) {
			int b = Integer.parseInt(temp[i].toString());
			int sum = b * b * b;
			total = total + sum;
		}
		System.out.println(total);

		if (total == num) {
			System.out.println("armstrong number");
		} else
			System.out.println("not armstrong");
	}

}
