package githubtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
        
       //so I used Actions class And moveToElement method to mouse over to the First image
        WebElement target = driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));
        
		Actions ac = new Actions(driver);
		ac.moveToElement(target);

	}

}
