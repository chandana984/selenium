package com.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Xlsjava  
{
	public static void main(String[] args) throws BiffException, IOException 
	{
		
	

    System.setProperty("webdriver.chrome.driver","C:\\Users\\chandanapt\\Documents\\Chrome\\chromedriver.exe"); 
    WebDriver d=new ChromeDriver();
    d.get("http://demo.automationtesting.in/Register.html");
    FileInputStream f=new FileInputStream("D:\\Book1.xls");
    Workbook b=Workbook.getWorkbook(f);
    Sheet s = b.getSheet(0);
    for(int row=1;row<=s.getRows();row++)
    {
    	String c=s.getCell(0,row).getContents();
    	d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(c);
    	String c1=s.getCell(1,row).getContents();
    	d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(c1);
    	d.navigate().refresh();
    }
    
    

}
}