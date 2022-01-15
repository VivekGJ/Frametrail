package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_constants
{
	public WebDriver driver;
   @BeforeMethod
   public void openAppl()
   {
	   System.setProperty(Chrome_key, Chrome_value);
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get(url);
	   
   }
   @AfterMethod
   public void closeAppln(ITestResult res) throws IOException 
   {
	
	   driver.close();
	   
   }
   
}
