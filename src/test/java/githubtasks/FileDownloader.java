package githubtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloader {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
        
        // So basically I am just locating the web element and using the .click method
        // of web driver 
		
		driver.findElement(By.xpath("//a[@href='download/some-file.txt']")).click();

	}

}
