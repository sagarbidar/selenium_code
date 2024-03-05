import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolingwebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		////driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/*JavascriptExecutor js =(JavascriptExecutor)driver;
		
		// scroll the web page 
		js.executeScript("Window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//scroll the components
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		//.tableFixHead td:nth-child(4)
		List<WebElement> values =driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum=0;
		for(int i=0;i<values.size();i++)
		{
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		}
*/
		driver.findElement(By.cssSelector(".totalAmount")).getText();
	}
}

