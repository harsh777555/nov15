package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Login 
{
  @Test(priority = 2)
  public void Login() 
  {
	  System.out.println("I'm in Login");
  }
  
  @Test(priority = 3)
  public void Reg() 
  {
	  System.out.println("I'm in Reg");
  }
  
  @Test(priority = 4)
  public void Home() 
  {
	  System.out.println("I'm in Home");
  }
  
  @Test(priority = 1)
  public void Logout() 
  {
	  throw new SkipException("We are working");
	  //System.out.println("I'm in Logout");
  }
  
  @Test(priority = 'a')
  public void ABC()
  {
	  System.out.println("ABBCC");
  }
}
