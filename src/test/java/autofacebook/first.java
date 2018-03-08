package autofacebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class first {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("test selenium");
		
		driver.findElement(By.xpath("//*[@id='u_0_c']")).click();

		//drop down menu
		Select sel1 = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		sel1.selectByVisibleText("Aug");
		
		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		sel2.selectByValue("6");
		
		Select sel3 = new Select(driver.findElement(By.xpath("//*[@id='year']")));
		sel3.selectByIndex(10);
		
		//scroll down
		Helpers.scrollToBottomOfPage(driver);
		
		
		//click submit button
		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[@class='clearfix']/button")).click();
		
		driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")).click();
		driver.navigate().back();
		
		

		Thread.sleep(3000);
		driver.quit();

	}

}
