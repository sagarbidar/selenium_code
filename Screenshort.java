import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("http://google.com");
		//src is a object
		Thread.sleep(3000);
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("C:\\Users\\AdminS\\eclipse-workspace\\Introduction1\\Screenshots\\Screenshot.png"));
	}

}
