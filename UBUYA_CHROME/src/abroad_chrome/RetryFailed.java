package abroad_chrome;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer {
	
	int minretrycount = 0;
	int maxretrycount = 3;

	@Override
	public boolean retry(ITestResult result) {
		
		if(minretrycount < maxretrycount) {
			System.out.println("This Test is Failing" +result.getName());
			System.out.println("Retrying this Test" +(minretrycount+1));
			minretrycount++;
			return true;
		}
		return false;
	}

}