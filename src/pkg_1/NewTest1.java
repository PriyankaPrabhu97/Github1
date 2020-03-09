package pkg_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 
{
  @Test
  public void f() 
  {
	  System.out.println("in testng");
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  WebDriver dr = new ChromeDriver();
	  dr.get("http://demowebshop.tricentis.com/login");
	  
  }
}
