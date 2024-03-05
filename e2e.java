import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// **********TC1 Radio button check startrs here ***********
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
        driver.findElement(By.id("divpaxinfo")).click();
       //Thread.sleep(2000);
        //driver.findElement(By.id("hrefIncAdt")).click();
        Thread.sleep(2000);
     // int i=1;  
      /* while(i<5)
     {
    	 driver.findElement(By.id("hrefIncAdt")).click();
    	 i++;
     } */
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
     for(int i=0;i<5;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
     System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       
        //driver.close();
        Thread.sleep(2000);
        
        //driver.get("https://lms.digitallync.ai/dashboard");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
     //driver.findElement(By.xpath("//a[@value='BLR']")).click();
     driver.findElement(By.xpath("//a[@value='MAA']")).click();
	
     Thread.sleep(2000);
     
     //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
     
     //driver.findElement(By.cssSelector("a[class='ui-state-default.ui-state-highlight.ui-state-active']")).click();
     
     //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
     System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
     driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
     System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
     System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
     
     if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
     {
    	 System.out.println("isenables"); 
    	 Assert.assertTrue(true);
     }
     else
     {
    	Assert.assertTrue(false);
     }
     
	

	/// **************TC2 Autosuggestive test case ******************
	
	driver.findElement(By.id("autosuggest")).sendKeys("IND");
	//driver.findElements(By.id("ui-id-1"));
	Thread.sleep(2000);
	List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
	for(WebElement option : options)
	{
		if(option.getText().equalsIgnoreCase("India"))
		{
			option.click();			
		break;	
		}
	}
	
	// ************* Testcase 3 statick drop down **************
	WebElement staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	//void dropdowdn1 =staticdropdown.click();
	Select dropdown=new Select(staticdropdown);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByIndex(2);
	dropdown.selectByVisibleText("USD");
	
	
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	driver.close();

	}
	
}
