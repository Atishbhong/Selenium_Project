package maven_project.maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Assignment_Sphinx {

	public static RemoteWebDriver driver;
	
	
	//open edge browser in headless mode 
	@Test
	public void headlessmodeTC01() {
     
		System.setProperty("webdriver.edge.driver", "C:\\\\Software\\\\Edge Driver\\\\msedgedriver.exe");
		
        EdgeOptions options1=new EdgeOptions();
        options1.addArguments("--headless");
		
	    driver=new EdgeDriver(options1);
		driver.close();
	}

	@Test
	public void navigatewebpageTC2() throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\\\Software\\\\Edge Driver\\\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/webpage");
		
		WebElement signup=driver.findElement(By.xpath("//a[@class='desktop:block xlm:w-140 xl:w-120 w-110 desktop:w-full text-center desktop:ml-0 desktop:mt-10 inline-block py-8 rounded xl:text-size-16 lg:text-size-10 ml-20 fromipad:ml-20 bg-black border border-black hover:bg-transparent hover:text-black text-white desktop:text-center desktop:py-10 ipadpro:ml-10 signup font-bold']"));
		signup.click();
		Thread.sleep(2000);
		}
	
	@Test
	public void registrationpageTC02() throws Exception {
		
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Amar bhosale");
	
		 Thread.sleep(2000);
	
		
		WebElement email=driver.findElement(By.name("email"));
		
		email.sendKeys("amarbhosale11@gmail.com");
		 Thread.sleep(2000);		
		
		
	
	
	
		
		WebElement password=driver.findElement(By.id("userpassword"));
		
	     password.sendKeys("Amarbhosale@123");
		 Thread.sleep(2000);
		 
	
	
	WebElement phoneno = driver.findElement(By.name("phone"));
	
	phoneno.sendKeys("9876543210");
	Thread.sleep(2000);
	
	}
	
	@Test
	public void signupTC03() throws Exception {
		
	
	WebElement signup = driver.findElement(By.xpath(
			"//button[@class='rounded border border-black block w-full xxld:text-size-20 xxl:text-size-18 xlx:text-size-16 xls:text-size-14 text-size-12 lg:h-35 xls:h-40 xlx:h-47 xxxl:h-54 xxld:h-60 h-40 tracking-widest font-bold uppercase g-recaptcha bg-black text-white  hover:bg-transparent hover:text-black']"));
	signup.click();
	
	Thread.sleep(2000);
	
	}
	
}
	






