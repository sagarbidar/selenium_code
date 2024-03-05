import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
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
     driver.close();
	}

}
