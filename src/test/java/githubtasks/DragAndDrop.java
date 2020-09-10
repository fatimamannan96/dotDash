package githubtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver ();
		
		// So for drag and drop and using Actions class and then I am invoking dragAndDrop
		// method by passing two parameters which are source and target.
		
		WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target);
		

	}

}
