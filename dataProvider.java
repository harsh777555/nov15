import org.testng.annotations.Test;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class dataProvider 
{
  @Test(dataProvider = "dp")
  public void f(String s1, String s2) throws InterruptedException 
  {
	  WebDriver wd = new ChromeDriver();
	  wd.get("https://practicetestautomation.com/practice-test-login");
	  Thread.sleep(2000);
	 // wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  wd.manage().window().maximize();
	  wd.findElement(By.id("username")).sendKeys(s1);
	  Thread.sleep(2000);
	  wd.findElement(By.id("password")).sendKeys(s2);
	  Thread.sleep(2000);
	  wd.findElement(By.id("submit")).click();
	  
	  List<WebElement> el = wd.findElements(By.tagName("ab"));
	  System.out.println("The count is: "+el.size());
	  for(WebElement e2 : el)
	  {
	  System.out.println("The number of text are : "+e2.getText());
	  }
	  wd.close();
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
 	{
      new Object[] { "student", "Password123" },
  //    new Object[] { "2", "b" },
    };
  }
}
