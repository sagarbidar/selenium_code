import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//void dropdowdn1 =staticdropdown.click();
		Select dropdown=new Select(staticdropdown);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("USD");
		
		
	//dropdown.selectByValue("INR");
		driver.close();
		//driver.cl
		//DF'/SCSCSDD FFF DDD X
	}

}
