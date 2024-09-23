package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class RadioBtnsAndChkBoxes {

	WebDriver driver;
	@Test
	public void radChk() throws InterruptedException
	{

		driver=new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement bmwrad=driver.findElement(By.id("bmwradio"));
		bmwrad.click();
		Thread.sleep(3000);
		boolean chkbmwrad=driver.findElement(By.id("bmwradio")).isSelected();
		if(chkbmwrad==true)
		{
			System.out.println("BMW Radio button is selected...");	
		}
		WebElement chkbenz=driver.findElement(By.id("benzcheck"));
		chkbenz.click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("benzcheck")).isSelected());
		WebElement chkhonda=driver.findElement(By.id("hondacheck"));
		chkhonda.click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("hondacheck")).isSelected());
		Thread.sleep(5000);
		driver.quit();
		
		
		
		}
}
