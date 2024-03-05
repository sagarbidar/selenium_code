import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		//WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(3000));
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='start'] button")));
		
		//parent and child relationship with css
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		Wait<WebDriver> wait=new Fluentwait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30)).ignore(NoSuchElementException.class);
	}

}
