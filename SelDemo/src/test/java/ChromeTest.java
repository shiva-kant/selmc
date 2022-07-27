import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChromeTest {
	WebDriver webDriver;
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivchou\\Downloads\\chromedriver.exe");
		webDriver=new ChromeDriver();
		webDriver.get("C:\\Users\\shivchou\\Desktop\\hello.html");
	}
	
  @Test
  public void testOne() {
	WebElement element=  webDriver.findElement(By.id("p"));
	String response=element.getText();
	assertEquals("Hello world", response);
  }
  
}
