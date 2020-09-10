package githubtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLinkOpensInNewTab {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
        
        driver.get("http://localhost:7080/windows"); 
        String parentwindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        driver.switchTo().window(parentwindow);
      

	}

}
