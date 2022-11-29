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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivchou\\Desktop\\driver\\chromedriver.exe");
  webDriver=new ChromeDriver();
  webDriver.get("file:///C:/Users/shivchou/Documents/sel/selmaven/hello.html");
	}
	
  @Test
  public void testOne() {
	WebElement element=  webDriver.findElement(By.id("i1"));
	String str=element.getText(); 
	assertEquals("xyz",str);
  }
  
}
