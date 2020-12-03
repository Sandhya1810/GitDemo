import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropDown {

	public static void main(String[] args) throws Exception {
		
        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JavaWorkspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		Select s= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByValue("3");
		s.selectByIndex(5);
		s.selectByVisibleText("3");
				
		Select s1= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s1.selectByValue("3");

		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='ATQ'])[2]")).click(); // by using indexes
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='IDR']")).click();
		//bu using parent child relation
		
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).isSelected());
		
		
		// calendar 
		
		
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		Assert.assertTrue(true);
		
		
	}

}
}
