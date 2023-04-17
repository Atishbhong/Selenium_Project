package maven_project.maven_project;



import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
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
	public void title() {
		System.out.println(driver.getTitle());
		
	}
	@Test
	public void shouldAnswerWithTrue() {

	assertTrue( true );
	

    {
}
	}}

