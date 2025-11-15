package testNG;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() throws IOException 
  {
	  WebDriver wd = new ChromeDriver();
	  wd.manage().window().maximize();
	  Properties p = new Properties();
	  FileReader fr = new FileReader("D:\\testNGh\\testng\\src\\input.property");
	  p.load(fr);
	  

	  wd.get(p.getProperty("url"));
	  wd.findElement(By.id("username")).sendKeys(p.getProperty("un"));
	  wd.findElement(By.id("password")).sendKeys(p.getProperty("pw"));
	  wd.findElement(By.id("login")).click();	  
  }
}
