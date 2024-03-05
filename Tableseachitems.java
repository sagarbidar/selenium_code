import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tableseachitems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(3000);
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> elementlist= driver.findElements(By.xpath("//tr//td[1]"));
		//elementlist.getFirst();
		
		List<WebElement> filtedlist=elementlist.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		System.out.println(filtedlist);
		Assert.assertEquals(elementlist.size(), filtedlist.size());
		driver.close();
	}

}
