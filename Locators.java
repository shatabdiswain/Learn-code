import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shatabdi\\Documents\\Chromedriver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("Shatabdi");
driver.findElement(By.name("inputPassword")).sendKeys("password");
driver.findElement(By.className("signInBtn")).click();
System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shatabdi");

	
	
	}

}


