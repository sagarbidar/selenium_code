import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///to set the behvaioirs of the browser to handle the ssh so we are using chromeoptions class
		ChromeOptions options =new ChromeOptions();
		// Proxy pp=new Proxy();
		
		options.setAcceptInsecureCerts(true);  //will accept the cetrificate and procedue the next
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());  //will get privacy error alert
	}

}
