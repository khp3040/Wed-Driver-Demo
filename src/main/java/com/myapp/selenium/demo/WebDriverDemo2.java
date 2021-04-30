package com.myapp.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverDemo2 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","C:/Softwares/geckodriver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C://Softwares//chromedriver//chromedriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C://DevOps-WorkSpace//webdriverdemo//src//main//webapp//demo1.html");
		
		WebElement checkbox = driver.findElement(By.id("onion"));
		checkbox.click();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();		
			}
		
		checkbox.click();
		
		WebElement selectElement = driver.findElement(By.id("select1"));
		Select select = new Select(selectElement);
		select.selectByVisibleText("Maybe");
		
		
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		radioButtons.get(2).click();
		
		radioButtons.forEach(radio -> {
		if(radio.isSelected()) {
		System.out.println(radio.getAttribute("value"));	
		}}) ;
		
		WebElement row = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]"));
		System.out.println(row.getText());
		
		
}
}
