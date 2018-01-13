package DDF.DDF1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*System.setProperty("webdriver.gecko.driver","D:\\seleniumdriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");*/
		
		   String baseUrl = "https://gmail.com";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";
	System.setProperty("webdriver.chrome.driver","D:\\seleniumdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.get(baseUrl);
		//	driver.navigate().to("www.gmail.com");
	        // launch Fire fox and direct it to the Base URL
	      

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	}

}
