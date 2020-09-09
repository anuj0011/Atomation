package calculation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Shipping")
public class Shipping extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		double num1 = Integer.parseInt(request.getParameter("num1"));
		String num2 = request.getParameter("num2");

		double sum = 0;
		double y;
		if (num2.equals("kuwait")) {

			y = (num1 - 1) * 2.5 + 9;
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
		}

		else if (num2.equals("oman")||(num2.equals("saudi")||(num2.equals("uae")||(num2.equals("qatar")||(num2.equals("bahrain")))))) {
			y = (num1 - 1) * 3 + 12;
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

		} else {
			y = (num1 - 1) * 3 + 15;
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
		}

		PrintWriter output = response.getWriter();
		output.println("Shipping Amount($) :" + sum);
	}
}
