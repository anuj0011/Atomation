package Api.Rest;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class myFirstRestAssuredClass {

	final static String url = "http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";

	public static void main(String[] args) {

		getResponseBody();
		getResponseStatus();
		getResponseHeaders();
		getResponseTime();
		getResponseContentType();
		getSpecificPartOfResponseBody();
		
	}

	// Getting the response Body
	public static void getResponseBody() {

		given().when().get(url).then().log().all();

		given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD", "1234!").queryParam("Account_No", "1").when()
				.get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();

	}

	// Getting the response status code
	public static void getResponseStatus() {
		int statusCode = given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD", "1234!")
				.queryParam("Account_No", "1").when().get("http://demo.guru99.com/V4/sinkministatement.php")
				.getStatusCode();
		System.out.println("The response status is " + statusCode);

		given().when().get(url).then().assertThat().statusCode(200);
	}

	// Getting Header response
	public static void getResponseHeaders() {
		System.out.println("The headers in the response " + get(url).then().extract().headers());
	}

	// Getting the response time
	public static void getResponseTime() {
		System.out.println(
				"The time taken to fetch the response " + get(url).timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
	}

	// Getting the content Type
	public static void getResponseContentType() {
		System.out.println("The content type of response " + get(url).then().extract().contentType());
	}

	// From the given response you are asked to calculate the total amount you need
	// to fetch every amount and sum it up
	public static void getSpecificPartOfResponseBody() {

		ArrayList<String> amounts = when().get(url).then().extract().path("result.statements.AMOUNT");
		int sumOfAll = 0;
		for (String a : amounts) {

			System.out.println("The amount value fetched is " + a);
			sumOfAll = sumOfAll + Integer.valueOf(a);
		}
		System.out.println("The total amount is " + sumOfAll);

	}
}
