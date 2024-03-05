import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.get("https://rahulshettyacademy.com/locatorspractice/");
   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("hello");
   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("hello");
   driver.findElement(By.linkText("Forgot your password?")).click();
   driver.findElement(By.xpath("//form/input[3]")).sendKeys("2334"); 
   Thread.sleep(2000);
   driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
   System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
   Thread.sleep(2000);
   driver.findElement(By.cssSelector(".go-to-login-btn")).click();
   Thread.sleep(2000);
   driver.close();
	
		
	}

}
