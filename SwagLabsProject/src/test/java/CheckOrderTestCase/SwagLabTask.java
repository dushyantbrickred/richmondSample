package CheckOrderTestCase;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabTask {

	@Test
	public void TC01_Login()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/thaboramalitse/eclipse-workspace/SwagLabsProject/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//maximizing window
		driver.manage().window().maximize();
		
		//openning the web address
		driver.get("https://www.saucedemo.com");
		
		//insert username
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		//insert password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//clicking login button
		driver.findElement(By.name("login-button")).click();
		
		
		
		
		
		
	}
	
	
}
