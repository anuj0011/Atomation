package restautomation;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestLearn {
	public static void main(String[] args) 
	{
		
			
			//WebDriver driver = new ChromeDriver();
			
			RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.request(Method.GET,"/Hyderabad");
			String responseBody = response.getBody().asString();
			System.out.println("Response body is" +responseBody);
			
			int statusCode = response.getStatusCode();
			//Assert.assertEquals(statusCode, 200);
		
	}
	

}
