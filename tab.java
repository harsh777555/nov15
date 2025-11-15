package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class tab 
{
	WebDriver wd = new ChromeDriver();

  @Test
  public void f() 
  {
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  wd.get("https://");	  
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
