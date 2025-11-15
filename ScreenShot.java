package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScreenShot 
{
	WebDriver w =new ChromeDriver();
  @Test
  public void f() 
  {
	  TakesScreenshot t = (TakesScreenshot)w;
	  File f = t.getScreenshotAs(OutputType.FILE);
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  w.get("https://www.google.com");
	  w.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  w.close();
  }

}
