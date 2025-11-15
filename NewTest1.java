package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest1 
{
	  WebDriver w = new ChromeDriver();
  @Test
  public void f() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  //w.findElement(By.name("username")).sendKeys("Admin");
	  //w.findElement(By.name("password")).sendKeys("admin123");
	  w.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  w.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

	  Thread.sleep(2000);
	  w.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	  Thread.sleep(2000);

  }
  @BeforeTest
  public void beforeTest() 
  {
	  w.manage().window().maximize();
	  w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() {
  }

}
