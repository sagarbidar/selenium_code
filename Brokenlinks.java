import java.io.IOException;
import java.net.HttpURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.net.URL;
import java.util.List;

//import java.net.URLConnection;

//import java.util.List;

public class Brokenlinks {

	public static void main(String[] args) throws  IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		//String url=driver.findElement(By.cssSelector("a[href*='REST']")).getAttribute("href");
		
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a= new SoftAssert();
		for(WebElement link:links)
		{
		String url=link.getAttribute("href");
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responsecide=conn.getResponseCode();
		System.out.println(responsecide);
		a.assertTrue(responsecide<400, "link with text"+link.getText()+"is broken with"+responsecide);
		}
		
		a.assertAll();
		/*if(responsecide>400)
		{
			System.out.println("link with text"+link.getText()+"is broken with"+responsecide);
			Assert.assertTrue(false);
		}*/
		Thread.sleep(3000);
		driver.close();
	}


}
