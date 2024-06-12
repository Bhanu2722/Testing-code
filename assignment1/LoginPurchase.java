package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPurchase {
	
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		
		// going to amazon website
		driver.get("http://www.amazon.in/");
		// clicking to sign in option
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click(); 
		// writing number
		driver.findElement(By.id("ap_email")).sendKeys("9414849262");  
		// clicking to continue button
        driver.findElement(By.id("continue")).click(); 
        // writing password
        driver.findElement(By.id("ap_password")).sendKeys("kanu1234"); 
        // clicking on submit button
        driver.findElement(By.id("signInSubmit")).click();
        //if password is wrong then it will show the test case passed
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Amazon sign in")) {
        	System.out.println("Test passed");
        }else {
        	System.out.println("Test Failed"); 
	}
  }
}
