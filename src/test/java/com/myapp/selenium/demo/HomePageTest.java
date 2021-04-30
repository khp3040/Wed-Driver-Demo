package com.myapp.selenium.demo;
 import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class HomePageTest {
    
    @Test
    public void canGoToHomePage() {
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
        
    }
}
