import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      String text="sagar";
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(300000));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='alertbtn']")));
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		//Selenium 4 new update for opening new windows
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles= driver.getWindowHandles();
		java.util.Iterator<String> it=handles.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		//childwindow.ge
		driver.switchTo().window(childwindow);
		driver.get("https://auth.ultimatix.net/utxLogin/login?TYPE=33554432&REALMOID=06-9ed1ab3e-4343-420c-b058-68beeef4c9ff&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EdbHMX6T+Wb8DN7DVmL5sbY+n+30S7n/gIBptYa9dLbudResX4AYm9ObPeNozoDH&TARGET=-SM-https%3A%2F%2Fwww.ultimatix.net%2Fuxportal%2Fuxportalhome.html%2FMegamenu");
		
		//driver.get
		//webDriverwait w =new webDriverwait(driver,10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("ultimatix-image")));
		driver.findElement(By.id("ultimatix-image")).click();
		driver.close();
	}

	
		
	}


