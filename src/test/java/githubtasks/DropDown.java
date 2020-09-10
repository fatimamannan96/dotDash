package githubtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
		
        
        // So I am using Select class to do the drop down and from the drop down I have selected 
        // "Option1" drop down
		Select sc = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
		sc.deselectByVisibleText("Option 1");
		

	}

}
