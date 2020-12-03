package TestIdeas;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question1 {
	
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JavaWorkspace\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://wanikirtesh.github.io/");
		//Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'department')]"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Marketing')]""))).click();
		driver.findElement(By.xpath("//option[contains(text(),'Administration')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Finance')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Technology')]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'region')]"))).click();
		driver.findElement(By.xpath("//option[contains(text(),'Americas')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Asia')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Europe')]")).click();
	
		driver.findElement(By.xpath("//button[@id='btnGen']")).click();// Generate Report
		
		Set<String> PopupID = driver.getWindowHandles();
		System.out.println(PopupID);
		System.out.println(PopupID.size());
		
		Iterator<String> it = PopupID.iterator();
		String mainWindow = it.next();
		String popUpWindow = it.next();
		
		driver.switchTo().window(popUpWindow);
		System.out.println(driver.getTitle());
		
		List<WebElement> allEmployees = driver.findElements(By.xpath("//table[@class='table table-striped table-bordered dataTable no-footer']/tbody/tr/td"));
		
		System.out.println("Total Count of Employees: " +allEmployees.size());
		
		
		
		String EmployeeName= "Chetan Patel";
		
		for(int i=0; i<allEmployees.size(); i++)
			
		{
			if (allEmployees.get(i).getText().equalsIgnoreCase(EmployeeName));
			
			{
				System.out.println("Chetan Patel is present");
				
				break;
				
			}
		}
		
		
		driver.quit();
		
			}
				
}
		
		
		
	