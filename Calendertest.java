import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendertest {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String monthnumber="12";
		String year="2023";
		String date="14";
		String[] expectedlist= {monthnumber,date,year};
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		////driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class='react-date-picker__inputGroup']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[class='react-calendar__navigation__label']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class='react-calendar__navigation__label']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		Thread.sleep(3000);
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthnumber)-1).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
        
        List<WebElement> actuallist=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
	
        for(int i=0;i<actuallist.size();i++)
        {
        	
        	System.out.println(actuallist.get(i).getAttribute("value"));
        	
        	Assert.assertEquals(actuallist.get(i).getAttribute("value"), expectedlist[i]);
        }
	
        Thread.sleep(3000);
        driver.close();
	}

}
