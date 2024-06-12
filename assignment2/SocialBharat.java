package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SocialBharat {
	public static void main(String[] args) throws InterruptedException {
    	   WebDriver driver = new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.get("https://uat.socialbharat.org/");
    	   Thread.sleep(3000);
    	   driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/div/button[1]")).click();
    	   driver.findElement(By.id("mobile")).sendKeys("9636476552");
    	   driver.findElement(By.id("password")).sendKeys("Bhanu@2722");
    	   driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
    	   Thread.sleep(3000);
    	   driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[3]/a")).click();
    	   WebElement DropDown = driver.findElement(By.xpath("//*[@id=\"service-section\"]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div/div[1]"));
    	   Select sel = new Select(DropDown);
   		   sel.selectByValue("Rajasthan");

    	   driver.findElement(By.xpath("//*[@id=\"service-section\"]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div/div[1]/div[2]")).sendKeys("Rajasthan");
       }
}
