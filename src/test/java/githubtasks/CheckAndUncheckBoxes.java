package githubtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAndUncheckBoxes {
	public static void main(String[] args) {
		
		
		// this is to launch the browser
		WebDriver driver= new ChromeDriver ();
		// this is for check 
		driver.findElement(By.xpath("//form[@id='checkboxes']")).click();
		
		// this is for unchecked
		driver.findElement(By.xpath("//form[@id='checkboxes']")).click();
		
		
	}

}
