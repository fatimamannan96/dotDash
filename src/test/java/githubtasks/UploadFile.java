package githubtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
        
       // So I am using sendKeys method and passing the file path as a parameter and then
        // I am clicking on the upload file 
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("/Users/fatimamannan/Downloads/Resume Fatima Akhter.docx");
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		
		

	}

}
