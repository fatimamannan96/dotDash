package githubtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNotificationMessage {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
        
        driver.get("http://localhost:7080/notification_message_rendered");
        driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
       WebElement Text= driver.findElement(By.xpath("//div[@id='flash']"));
        String s = Text.getText();
        Assert.assertEquals(s, " Action unsuccesful, please try again");

	}

}
