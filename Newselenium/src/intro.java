import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://pli.indiapost.gov.in/CustomerPortal/psLoginaction.action");
		

	}

}
