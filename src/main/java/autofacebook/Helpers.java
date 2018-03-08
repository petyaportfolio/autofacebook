package autofacebook;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Helpers {

	public static void scrollToBottomOfPage(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
	}
	
	
	

}
