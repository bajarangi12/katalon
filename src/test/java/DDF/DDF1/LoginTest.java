package DDF.DDF1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver","D:\\seleniumdriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
  }
}
