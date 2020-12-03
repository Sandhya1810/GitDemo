import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JavaWorkspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[name='email'")).sendKeys("Sandnya");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.xpath("//*[@id=\"identify_email\"]")).sendKeys("234");
		driver.findElement(By.xpath("//input[@name='did_submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("body.UIPage_LoggedOut._-kb._605a.b_c3pyn-ahh.chrome.webkit.win.x1-5.Locale_en_GB.cores-gte4._19_u.hasAXNavMenubar:nth-child(2) div._li:nth-child(2) div.uiContextualLayerParent:nth-child(3) div.fb_content.clearfix:nth-child(1) div._4-u5._30ny div.help_identify form:nth-child(1) div.mvl.ptm.uiInterstitial.uiInterstitialLarge.uiBoxWhite:nth-child(3) div.phl.ptm.uiInterstitialContent div.pam.uiBoxRed > div:nth-child(2)")).getText());
		
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		
		
		
	
	
	
	}

}
