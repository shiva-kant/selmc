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
		System.out.println("Hello");
	}
	
  @Test
  public void testOne() {
	System.out.println("Hello");
  }
  
}
