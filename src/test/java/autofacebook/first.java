package autofacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class first {

	public static void main(String[] args) {
			
	WebDriver driver = new FirefoxDriver();
	

	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//*[@id='u_0_n']")).sendKeys("test selenium");
	driver.findElement(By.xpath("//*[@id='u_0_c']")).click();
	
	Select sel1 = new Select (driver.findElement(By.xpath("//*[@id='month']")));
			sel1.selectByVisibleText("Aug");;
	Select sel2 = new Select (driver.findElement(By.xpath("//*[@id='day']")));
			sel2.selectByValue("6");
	Select sel3 = new Select (driver.findElement(By.xpath("//*[@id='year']")));
			sel3.selectByIndex(10);;
	
	driver.findElement(By.xpath("//*[@id='u_0_15']")).click();
	driver.getCurrentUrl();
	}	
	
	
}
		
	



