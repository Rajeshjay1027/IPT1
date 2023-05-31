package com.ProjectTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class TestRunner {

	
    static WebDriver driver;
    WebElement element;
	ChromeOptions options;
	private void TicketBooking() {
	     WebDriverManager.chromedriver().setup();
	     options = new ChromeOptions();
	     options.addArguments("incognito");
	     options.addArguments("start-maximized");
	     System.out.println("Before-suite--->seup");
	     
	     driver= new ChromeDriver(options);
	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	     driver.get("https://www.goibibo.com/flights/air-MAA-IXM-20230530--1-0-0-E-D?");
	     System.out.println("Flight timing shows here:");
	     
	     List<WebElement>findElements=driver.findElements(By.xpath("//span[@class='filtersstyles__FltHpyStp-sc-1hyeel5-11 ibJKtY font11 padLR5 padTB10 dF alignItemsCenter justifyCenter']"));
	     for (WebElement webElement : findElements) {
	   	 System.out.println(webElement.getText());
	   	 
	}
	

			driver.findElement(By.xpath("//*[text()='Before 6AM']")).click();
			System.out.println("Your flight time is :" + "Before 6AM");
//		WebElement selectElement=driver.findElement(By.name("Before 6AM"));
//	Select select=new Select(selectElement);
//	System.out.println(select);
	
			driver.findElement(By.xpath("//*[text()='VIEW FARES']")).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			System.out.println("Price list : Book your ticket");
//	   	   Actions action = new Actions(driver);
//	   	   driver.findElement(By.xpath("//*[text()='VIEW FARES']"));
//	    	WebElement elementToClick = (WebElement) (driver);
//			action.click(elementToClick).build().perform();  
//			System.out.println("Select the coach");
//			
			  List<WebElement>findElements1=driver.findElements(By.xpath("//span[@class='font20 fb']"));
			     for (WebElement webElement : findElements1) {
			   	 System.out.println(webElement.getText());
	}
//			     driver.findElement(By.xpath(null))
}

}
////div[@class='black fb font14 padB10 quicksand']

