import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		Thread.sleep(300);
	
	driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
	
	Set<String> windows=driver.getWindowHandles();
	
	Iterator<String> it=windows.iterator();
	String parentid=it.next();
	String childid=it.next();
	System.out.println(driver.switchTo().window(childid).getTitle());
	//System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	String emailid=driver.findElement(By.cssSelector("a[href='mailto:mentor@rahulshettyacademy.com']")).getText();
	
	// driver.findElement(By.cssSelector(".im-para.red")).getText();

//String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	driver.close();
	driver.switchTo().window(parentid);
	driver.findElement(By.id("username")).sendKeys(emailid);
	
	}
	

}
