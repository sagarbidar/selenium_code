import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablefilter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(3000);
		
		//1st click
		driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> elementlist= driver.findElements(By.xpath("//tr//td[1]"));
		List<String> originallist =elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originallist);
		
		
		List<String> sortedllist =originallist.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedllist);

		Assert.assertEquals(originallist, sortedllist);
		
		List<String> prize=elementlist.stream().filter(s->s.getText().contains("Beans")).
		map(s->s.getPriceVeggie()).collect(Collectors.toList());
		prize.forEach(a->System.out.println(a));
		
		
		private static String getPriceVeggie(WebElement s)
		{
			
			String prizevalue=s.findElement(By.xpath("")).getText();
			return prizevalue;
		}
		
		
		
		
		
		
		
		///2nd 
		
		/*driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> elementlist1= driver.findElements(By.xpath("//tr//td[1]"));
		List<String> originallist1 =elementlist1.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originallist1);
		
		for(int i=0;i<originallist1.size();i++)
		{
			List<String> originallist12=originallist1.stream().sorted().collect(Collectors.toList());
			Assert.assertEquals(originallist1, originallist12);
		}
		//Assert.assertTrue(originallist1.equals("ls"));
		//Assert.assertEquals(originallist1, originallist12);
		
		//Assert.assertEquals(sortedllist, originallist1);
		*/
		driver.close();
		
		
	}

}
