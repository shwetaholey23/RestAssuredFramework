package baseTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utils.ExtentReportListeners;
import utils.FileAndEnv;


@Listeners(ExtentReportListeners.class)
public class BaseTest extends ExtentReportListeners {
	
	
	
	
	@Test
	public void utilTest()
	{
		
		int a=10,b=40;
		
		int c=a+b;
		
		test.log(LogStatus.INFO, "Test has been started");
		test.log(LogStatus.PASS, "Test has been successfully passed");
		
		test.log(LogStatus.PASS, "Sum of a and b is :" + c);
	}

	
	
}
