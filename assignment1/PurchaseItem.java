package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PurchaseItem {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
    	//Maximize
    	driver.manage().window().maximize(); 
    	// amazon.in
    	driver.get("http://www.amazon.in/");
    	//giving values to search bar
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earbuds"); 
    	// clicking on search button   
    	driver.findElement(By.id("nav-search-submit-button")).click();
    	// tick on get it by tomorrow
        driver.findElement(By.xpath("//*[@id=\"p_90/6741118031\"]/span/a/div/label/i")).click(); 
        //delay for 3 second
        Thread.sleep(3000); 
        // add to cart
        driver.findElement(By.id("a-autoid-27-announce")).click(); 
        // delay for 5 second
        Thread.sleep(5000);
        // going to cart
        driver.findElement(By.xpath("//*[@id=\"ewc-compact-actions-container\"]/div/div[2]/span/span/a")).click();
        // proceed to buy 
        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click(); 
        
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Amazon sign in")) {
        	System.out.println("Test passed");
        }else {
        	System.out.println("Test Failed");
        }
    }
}
