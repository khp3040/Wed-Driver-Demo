package com.myapp.selenium.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverSeleniumServer {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
//		Properties p = new Properties();
//        p.put("webdriver.gecko.driver", "C:/Softwares/geckodriver/geckodriver.exe");
//        p.put("webdriver.chrome.driver", "C:/Softwares/chromedriver/chromedriver.exe");
//        
//        System.setProperties(p);
		
		
		
		System.setProperty("webdriver.gecko.driver","C://Softwares//geckodriver//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C://Softwares//chromedriver//chromedriver.exe");
				
//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
				
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
//				DesiredCapabilities.chrome());
        		
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
//				DesiredCapabilities.firefox());
        
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				new DesiredCapabilities(DesiredCapabilities.chrome(),DesiredCapabilities.firefox()));
				
        
		
        
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
