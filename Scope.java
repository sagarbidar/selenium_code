import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//get the links counts on the web page 
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		Thread.sleep(300);
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
						//
		//count of footer section
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//1st column footer section
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinktabs=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktabs);
			Thread.sleep(5000);
			
		}
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
		//it will run untill unless next windows deosn;t exists
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
		}
		
		//)
		
		
	}


