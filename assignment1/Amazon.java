package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		try {
			//used to maximize the screen
			driver.manage().window().maximize();
			
			// searching Website
			driver.get("http://www.amazon.in/"); 
			
			//clicking on sign button	
			driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();	
			
			//creating account
			driver.findElement(By.id("createAccountSubmit")).click();
			
			// entering name
			driver.findElement(By.id("ap_customer_name")).sendKeys("bhanu"); 
			
			//new number then we got puzzle 
			//driver.findElement(By.id("ap_phone_number")).sendKeys("9636476552");  // already registered number then the otp page will open
			driver.findElement(By.id("ap_phone_number")).sendKeys("102346789"); 
			
			// entering password
			driver.findElement(By.id("ap_password")).sendKeys("Bhanu@123");
			
			// submit button
			driver.findElement(By.className("a-button-input")).click();
			
			//delay for 10 second
			Thread.sleep(10000);
			
			//entering in frame 1
			WebElement Puzzle1 = driver.findElement(By.id("cvf-aamation-challenge-iframe"));
			driver.switchTo().frame(Puzzle1);
			
			//entering in frame 2
			WebElement Puzzle2 = driver.findElement(By.id("aacb-arkose-frame"));
			driver.switchTo().frame(Puzzle2);
			
			//entering in frame 3
			WebElement Puzzle3 = driver.findElement(By.xpath("//*[@id=\"arkose\"]/div/iframe"));
			driver.switchTo().frame(Puzzle3);
			
			//entering in frame 4
			WebElement Puzzle4 = driver.findElement(By.id("game-core-frame"));
			driver.switchTo().frame(Puzzle4);
			
			// clicking on start puzzle 
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/button")).click();
			
			//coming out from frame 4
			driver.switchTo().parentFrame();
			
			//coming out from frame 3
			driver.switchTo().parentFrame();
			
			//coming out from frame 2
			driver.switchTo().parentFrame();
			
			//clicking on Need Help button
			driver.findElement(By.id("aa_arkose_customer_support_link")).click();
			
			//Delay of 3 second
			Thread.sleep(3000);
			
			//coming out from all the remaining frames
			driver.switchTo().defaultContent();
			
			//clicking on the amazon icon
			driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div/a/i")).click();
			
		}catch(Exception error){
			System.out.println(error);
		}finally {
			driver.quit();		
			System.out.println("Driver Quit");
		}

	}

}
