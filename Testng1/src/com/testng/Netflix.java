package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
public class Netflix {
	WebDriver  d;

	@Test
	public void f() {
		 d.findElement(By.xpath("//a[@class=\"authLinks redButton\"]")).click();
	     d.findElement(By.xpath("//input[@name=\"userLoginId\"]")).sendKeys("priyanarasimman1999@gmail.com");
	     d.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("7858");
	     d.findElement(By.xpath("//button[@class=\"btn login-button btn-submit btn-small\"]")).click();
	         
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\chandanapt\\Documents\\Chrome\\chromedriver.exe");
      d = new ChromeDriver();
      d.get("https://www.netflix.com/in/");
      d.manage().window().maximize();

  }

  @AfterTest
  public void afterTest() {
  }

}
