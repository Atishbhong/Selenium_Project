package maven_project.maven_project;



import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;
public class SeleniumProject {
	WebDriver driver;

	
	@Test
	public void navigatewebpageTC02() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Software\\\\Edge Driver\\\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/webpage");

		WebElement signup = driver.findElement(By.xpath(
				"//a[@class='desktop:block xlm:w-140 xl:w-120 w-110 desktop:w-full text-center desktop:ml-0 desktop:mt-10 inline-block py-8 rounded xl:text-size-16 lg:text-size-10 ml-20 fromipad:ml-20 bg-black border border-black hover:bg-transparent hover:text-black text-white desktop:text-center desktop:py-10 ipadpro:ml-10 signup font-bold']"));
		signup.click();
		Thread.sleep(2000);

	}
	
	@Test 
	
	public void nameTC03() throws InterruptedException {
		
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("abcd");
		
		Thread.sleep(2000);
	}
	
	
@Test 
	
	public void emailTC04() throws InterruptedException {
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abcd01@gmail.com");
		
		Thread.sleep(2000);
		
}
	
@Test 

public void passwordTC05() throws InterruptedException {
	
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("abcd");
	
	Thread.sleep(2000);
}
	
@Test 

public void phonenoTC06() throws InterruptedException {
	
	WebElement phoneno=driver.findElement(By.name("phone"));
	phoneno.sendKeys("abcd");
	
	Thread.sleep(2000);
}	
	
@Test 

public void signupTC07() throws InterruptedException {
	
	WebElement signup=driver.findElement(By.xpath("//button[@class='rounded border border-black block w-full xxld:text-size-20 xxl:text-size-18 xlx:text-size-16 xls:text-size-14 text-size-12 lg:h-35 xls:h-40 xlx:h-47 xxxl:h-54 xxld:h-60 h-40 tracking-widest font-bold uppercase g-recaptcha bg-black text-white  hover:bg-transparent hover:text-black']"));
	signup.sendKeys("abcd");
	
	Thread.sleep(2000);
}		
	
	
	

	@Test
	public void title() {
		System.out.println(driver.getTitle());
		
	}
	
	}

