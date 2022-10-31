package CheckOrderTestCase;



import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabTask {

	@Test
	public void TC01_Login()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/thaboramalitse/eclipse-workspace/SwagLabsProject/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//maximizing window
		driver.manage().window().maximize();
		
		//opening the web address
		driver.get("https://www.saucedemo.com");
		
		//insert user_name
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		//insert password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//clicking login button
		driver.findElement(By.name("login-button")).click();
		
		
		
		//Going to the next page and confirminf if the page loaded
		//Validating we actually loaded the correct page
		
		String expected_title = "Products";
		String actual_title = driver.getTitle();
		
		Assert.assertEquals(expected_title, actual_title);
		
		
		//Viewing all the items are available
		driver.findElement(By.id("inventory_container"));
		
		
		//Taking screenshot for report purposes
		
		//adding items to cart
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		
		driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
		
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		
		
		
		//viewing my cart
		
		driver.findElement(By.id("shopping_cart_container")).click();
		
		//validating cart page
		String expected_title1 = "Your Cart";
		String actual_title1 = driver.getTitle();
		
		
		Assert.assertEquals(expected_title1, actual_title1);
		
		
		//checking out
		driver.findElement(By.name("checkout")).click();
		
		
		
		//validating checkout info page
	   String expected_title2 = "Checkout: Your Information";
	   String actual_title2 = driver.getTitle();
				
				
	   Assert.assertEquals(expected_title2, actual_title2);
		
	   
	   //Information including
	   
	   driver.findElement(By.name("firstName")).sendKeys("Richmond");
	   
	   driver.findElement(By.name("lastName")).sendKeys("Ramalitse");
	   
	   driver.findElement(By.name("postalCode")).sendKeys("1961");
	   
	   
	   driver.findElement(By.id("continue")).click();
	   
	   File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   String screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	   
	   
		
	}
	
	
}
