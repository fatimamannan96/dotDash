package githubtasks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFloatingMenu {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
        
        driver.get("http://localhost:7080/floating_menu");
       
        JavascriptExecutor js = ( JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)","");

	}

}
