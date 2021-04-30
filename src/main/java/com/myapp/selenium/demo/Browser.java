package com.myapp.selenium.demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser {
    static WebDriver driver =null;
    
    static {
    System.setProperty("webdriver.chrome.driver", "C://Softwares//chromedriver//chromedriver.exe");
    driver = new ChromeDriver();
    }
    
    public static void goTo(String url) {
        driver.get(url);
    }
    
    public static String title() {
        return driver.getTitle();
    }
    
    
 }