import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugestionDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JavaWorkspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		List<WebElement> options =  driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for (WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("India"))
				
			{
				option.click();
				break;
			
			}
		}

	}

}
