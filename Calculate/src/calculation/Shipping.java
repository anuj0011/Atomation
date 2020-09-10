package calculation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Shipping")
public class Shipping extends HttpServlet {
	double y;
	double z;
	double sum = 0;
	double china;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		double num1 = Integer.parseInt(request.getParameter("num1"));
		String num2 = request.getParameter("num2");
		String stores = request.getParameter("stores");

		if (num2.equals("kuwait")) {
			if (stores.equals("us")) {

				y = (num1 - 1) * 2.5 + 9;
				Margine(request, response);
			} else if (stores.equals("uk")) {

				y = (num1 - 1) * 2.5 + 9 + 5;
				Margine(request, response);
			} else if (stores.equals("hk")) {

				china = (num1 - 1) * 2.5 + 9;
				y = (china * .15) + china;
				Margine(request, response);
			}

		}

		else if (num2.equals("oman") || (num2.equals("saudi")
				|| (num2.equals("uae") || (num2.equals("qatar") || (num2.equals("bahrain")))))) {
			if (stores.equals("us")) {

				y = (num1 - 1) * 3 + 12;
				Margine(request, response);
			} else if (stores.equals("uk")) {

				y = (num1 - 1) * 3 + 12 + 5;
				Margine(request, response);
			} else if (stores.equals("hk")) {

				china = (num1 - 1) * 3 + 12;
				y = (china * .15) + china;
				Margine(request, response);
			}

		} else {
			if (stores.equals("us")) {

				y = (num1 - 1) * 3 + 15;
				Margine(request, response);
			} else if (stores.equals("uk")) {

				y = (num1 - 1) * 3 + 15 + 5;
				Margine(request, response);
			} else if (stores.equals("hk")) {

				china = (num1 - 1) * 3 + 15;
				y = (china * .15) + china;
				Margine(request, response);
			}
		}

		PrintWriter output = response.getWriter();
		output.println("Shipping Amount($) :" + z);
	}

	public void Margine(HttpServletRequest request, HttpServletResponse response) {
		double num3 = Integer.parseInt(request.getParameter("num3"));
		String nonprime = request.getParameter("nonprime");
		if (y <= 20) {

			sum = (y * .20) + y;
		} else if (y > 20 && y <= 70) {
			sum = (y * .15) + y;

		} else if (y > 70 && y <= 100) {
			sum = (y * .10) + y;

		} else if (y > 100 && y <= 300) {
			sum = (y * .08) + y;

		} else {
			sum = (y * .05) + y;
		}

		if (num3 == 2) {
			if (nonprime.equals("yes")) {
				z = sum + 2;
			} else {
				z = sum + 1;
			}

		} else if (num3 == 3) {
			if (nonprime.equals("yes")) {
				z = sum + 3;
			} else {
				z = sum + 2;
			}
		} else if (num3 > 3 && num3 < 10) {
			if (nonprime.equals("yes")) {
				z = (num3 * 2) + sum;
			} else {
				z = (num3 * 1) + sum;
			}
		} else if (num3 >= 10) {
			if (nonprime.equals("yes")) {
				z = (num3 * 3) + sum;
			} else {
				z = (num3 * 2) + sum;
			}
		}

	}

}
