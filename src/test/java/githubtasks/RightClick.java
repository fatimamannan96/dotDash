package githubtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
        
        // So for doing right click I am using Actions class and I am using contextClick mehtod
        // of an actions class
        WebElement element = driver.findElement(By.xpath("//div[@id='hot-spot']"));       
        Actions ac = new Actions(driver);
        ac.contextClick(element);

	}

}
