package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class user 
{
  @Test
  @Parameters({"username", "password"})
  public void f(String username, String password) throws InterruptedException 
  {
	  WebDriver w = new ChromeDriver();	  
	  w.manage().window().maximize();
	  w.get("https://practice.expandtesting.com/login");
	  JavascriptExecutor js = (JavascriptExecutor)w;
	  js.executeScript("argument[0].scrollIntoView(true);",w);
//	  js.executeScript("window.scrollBy(0,960)");
	 
	  w.findElement(By.id("username")).sendKeys(username);
	  Thread.sleep(2000);
	  w.findElement(By.id("password")).sendKeys(password);
	  Thread.sleep(2000);
	  w.findElement(By.id("submit-login")).click();
	  Thread.sleep(2000);	
	  w.close();
  }
}
