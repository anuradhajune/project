package org.testng;

public class Failed  implements IRetryAnalyzer{
int min=0,max=0;
	public boolean retry(ITestResult result) {
		if (min<max) {
			min++;
			return true;
		}
		return false;
	}

}
