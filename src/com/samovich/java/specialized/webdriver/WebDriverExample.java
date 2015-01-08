/**
 * @file WebDriverExample.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 10/31/2014
 */

package com.samovich.java.specialized.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class WebDriverExample {

    public static void main(String[] args) {
    
    /*
     * Create a new instance of the html unit driver. Notice that the remainder
     * of the code relies on the interface, not the implementation.
     */
    WebDriver driver = new HtmlUnitDriver();
    
    // And now use this to visit Google
    driver.get("http://google.com");
    
    // Find the text input element by its name
    WebElement element = driver.findElement(By.name("q"));
    
    // Enter something to search for
    element.sendKeys("Cheese!");
    
    // Submit the form. WebDriver will find the form for us from the element
    element.submit();
    
    // Check the title of the page
    System.out.println("Page title is: " + driver.getTitle());
    
    driver.quit();
    
    }

}
