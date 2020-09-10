package githubtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIframe {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
        
        driver.get("http://localhost:7080/iframe");
        driver.switchTo().frame(driver.findElement(By.xpath(" //iframe[@id='mce_0_ifr']")));
        
   

	}

}
