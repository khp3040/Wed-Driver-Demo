package com.myapp.selenium.demo;
public class HomePage {
    
    static String url ="https://www.google.com";
    static String title ="google";
    
    
    public void goTo() {
        Browser.goTo(url);
    }
    
    public boolean isAt() {
        return Browser.title().equalsIgnoreCase(title);
    }
    
}