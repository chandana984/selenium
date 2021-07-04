package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Deyga {
	 WebDriver d;
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\chandanapt\\Documents\\Chrome\\chromedriver.exe");
     d = new ChromeDriver();
     d.get("https://deyga.in/");
     d.manage().window().maximize();
	}
  @Test
  public void f() {
	  WebElement account=d.findElement(By.xpath("//*[@id=\"section-header\"]/div[1]/div[1]/div[3]/div[1]/nav/ul/li[1]/a"));
      Actions action =new Actions(d);
      action.moveToElement(account);
      action.build().perform();
      //mouse over for account login
      WebElement login=d.findElement(By.xpath("//*[@id=\"section-header\"]/div[1]/div[1]/div[3]/div[1]/nav/ul/li[1]/div/ul/li[1]/a"));
      Actions b =new Actions(d);
      action.moveToElement(login);
      action.click().build().perform();
      
      d.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/input")).sendKeys("gokulap09@gmail.com");
      d.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/input")).sendKeys("Priyadeepu@1234");
      d.findElement(By.xpath("//*[@id=\"customer_login\"]/button")).click();
     
      WebElement skincare=d.findElement(By.xpath("//*[@id=\"section-header\"]/div[1]/div[2]/nav/ul/li[1]/a"));
      Actions c = new Actions(d);
      c.moveToElement(skincare);
      c.build().perform();
      WebElement lipcare=d.findElement(By.xpath("//*[@id=\"section-header\"]/div[1]/div[2]/nav/ul/li[1]/div/ul/li[5]/a"));
      Actions e =new Actions(d);
      e.moveToElement(lipcare);
      e.click().perform();
      
  }

  @AfterTest
  public void afterTest() {
	  
	
	  

  }

}
