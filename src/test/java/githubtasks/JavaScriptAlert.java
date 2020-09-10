package githubtasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlert {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
        
        // So for JavaScript alert pop up I am using Alert class and using the accept() method
        // to accept the alert pop up
        
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        
        Alert alert = driver.switchTo().alert();
        alert.accept();

	}

}
