import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_project
{
	WebDriver driver;
  @Test
  public void openbrowserTC01(){
	  System.setProperty("webdriver.edge.driver", "C:\\\\Software\\\\Edge Driver\\\\msedgedriver.exe");
		driver = new EdgeDriver();
	    driver.get("https://www.lambdatest.com/webpage");
		driver.manage().window().maximize();		 
  }
	@Test
	public void signupTC02() throws InterruptedException {
  WebElement signup = driver.findElement(By.xpath(
			"//a[@class='desktop:block xlm:w-140 xl:w-120 w-110 desktop:w-full text-center desktop:ml-0 desktop:mt-10 inline-block py-8 rounded xl:text-size-16 lg:text-size-10 ml-20 fromipad:ml-20 bg-black border border-black hover:bg-transparent hover:text-black text-white desktop:text-center desktop:py-10 ipadpro:ml-10 signup font-bold']"));
	signup.click();
	Thread.sleep(2000);
	
		
		
		WebElement fullname = driver.findElement(By.id("name"));
		fullname.sendKeys("xyz");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("xyz51@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("abcd@123");
		Thread.sleep(2000);
		
		
		WebElement phoneno = driver.findElement(By.name("phone"));
		phoneno.sendKeys("9876543210");
		Thread.sleep(2000);
		
		WebElement signup1 = driver.findElement(By.xpath(
				"//button[@class='rounded border border-black block w-full xxld:text-size-20 xxl:text-size-18 xlx:text-size-16 xls:text-size-14 text-size-12 lg:h-35 xls:h-40 xlx:h-47 xxxl:h-54 xxld:h-60 h-40 tracking-widest font-bold uppercase g-recaptcha bg-black text-white  hover:bg-transparent hover:text-black']"));
		signup1.click();
		Thread.sleep(2000);
		
		
		
		
		
		
  }

}