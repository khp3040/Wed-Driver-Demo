package com.myapp.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","C:/Softwares/geckodriver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C://Softwares//chromedriver//chromedriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		WebElement searchField = driver.findElement(By.name("q"));
		
		searchField.sendKeys("ibm");
		searchField.submit();
		
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		
		WebElement imageElement = driver.findElements(By.cssSelector("img[cls = rg_I]")).get(0);
		
		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		imageLink.click();

}
}
