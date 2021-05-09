package com.test.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("testing");
	  WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\JavaSourceCode\\FlipkartBackUp\\MavenProjectTest\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
  }
}
