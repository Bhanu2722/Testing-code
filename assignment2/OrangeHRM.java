package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
      public static void main(String[] args) throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	Thread.sleep(5000); 
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    	Thread.sleep(3000);

    	//Test case 8
    	//DashBoard
    	String title = driver.getTitle();
    	    if(title.equalsIgnoreCase("orangehrm")) {
    	    	System.out.println("Test is passed");
    	    }else {
    	    	System.out.println("Test is failed");    	
    	    }
    	
    	WebElement element8 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		 String pageText8 = element8.getText();
		 String textToVerify8 = "Dashboard";
		 
		 if (pageText8.contains(textToVerify8)) {
	            System.out.println("" + textToVerify8  + " Matched");
	        } else {
	            System.out.println("" + textToVerify8  + " MisMatched");
}
    	
    	
    	//Test case 1
		//Admin
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
    	Thread.sleep(3000);
    	
    	String title2 = driver.getTitle();
	    if(title2.equalsIgnoreCase("orangehrm")) {
	    	System.out.println("Test is passed");
	    }else {
	    	System.out.println("Test is failed");    	
	    }
        
    	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]"));
		 String pageText1 = element1.getText();
		 String textToVerify1 = "Admin";
		 if (pageText1.contains(textToVerify1)) {
	            System.out.println("" + textToVerify1  + " Matched");
	        } else {
	            System.out.println("" + textToVerify1  + " MisMatched");
}
		 driver.navigate().back();
		 
	    //Test case 2
		//PIM
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
    	Thread.sleep(3000);
    	
    	String title3 = driver.getTitle();
	    if(title3.equalsIgnoreCase("orangehrm")) {
	    	System.out.println("Test is passed");
	    }else {
	    	System.out.println("Test is failed");    	
	    }
	    WebElement element2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		 String pageText2 = element2.getText();
		 String textToVerify2 = "PIM";
		 
		 if (pageText2.contains(textToVerify2)) {
	            System.out.println("" + textToVerify2  + " Matched");
	        } else {
	            System.out.println("" + textToVerify2  + " MisMatched");
}
		 driver.navigate().back();
		 
	    //Test case 3
		//Leave
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")).click();
    	Thread.sleep(3000);
    	
    	String title4 = driver.getTitle();
	    if(title4.equalsIgnoreCase("orangehrm")) {
	    	System.out.println("Test is passed");
	    }else {
	    	System.out.println("Test is failed");    	
	    }
	    WebElement element3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		 String pageText3 = element3.getText();
		 String textToVerify3 = "Leave";
		 
		 if (pageText3.contains(textToVerify3)) {
	            System.out.println("" + textToVerify3  + " Matched");
	        } else {
	            System.out.println("" + textToVerify3  + " MisMatched");
}
		 driver.navigate().back();
		 
	    //Test case 4
		//Time
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")).click();
    	Thread.sleep(3000);
    	
    	String title5 = driver.getTitle();
	    if(title5.equalsIgnoreCase("orangehrm")) {
	    	System.out.println("Test is passed");
	    }else {
	    	System.out.println("Test is failed");    	
	    }
	    WebElement element4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]"));
		 String pageText4 = element4.getText();
		 String textToVerify4 = "Time";
		 
		 if (pageText4.contains(textToVerify4)) {
	            System.out.println("" + textToVerify4  + " Matched");
	        } else {
	            System.out.println("" + textToVerify4  + " MisMatched");
}
		 driver.navigate().back();
		 
	    //Test case 5 
		//Recruitment
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
    	Thread.sleep(3000);
    	
    	String title6 = driver.getTitle();
	    if(title6.equalsIgnoreCase("orangehrm")) {
	    	System.out.println("Test is passed");
	    }else {
	    	System.out.println("Test is failed");    	
	    }
	    WebElement element5 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		 String pageText5 = element5.getText();
		 String textToVerify5 = "Recruitment";
		 
		 if (pageText5.contains(textToVerify5)) {
	            System.out.println("" + textToVerify5  + " Matched");
	        } else {
	            System.out.println("" + textToVerify5  + " MisMatched");
}
		 driver.navigate().back();
		 
		 
	    //Test case 6
		//My info
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")).click();
    	Thread.sleep(3000);
    	
    	String title7 = driver.getTitle();
	    if(title7.equalsIgnoreCase("orangehrm")) {
	    	System.out.println("Test is passed");
	    }else {
	    	System.out.println("Test is failed");    	
	    }
	    WebElement element6 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		 String pageText6 = element6.getText();
		 String textToVerify6 = "PIM";
		 
		 if (pageText6.contains(textToVerify6)) {
	            System.out.println("" + textToVerify6  + " Matched");
	        } else {
	            System.out.println("" + textToVerify6  + " MisMatched");
}
		 driver.navigate().back();
		 
	    //Test case 7
		//Performance
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]/a")).click();
    	Thread.sleep(3000);
    	
    	String title8 = driver.getTitle();
	    if(title8.equalsIgnoreCase("orangehrm")) {
	    	System.out.println("Test is passed");
	    }else {
	    	System.out.println("Test is failed");    	
	    }
	    WebElement element7 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]"));
		 String pageText7 = element7.getText();
		 String textToVerify7 = "Performance";
		 
		 if (pageText7.contains(textToVerify7)) {
	            System.out.println("" + textToVerify7  + " Matched");
	        } else {
	            System.out.println("" + textToVerify7  + " MisMatched");
}
		 driver.navigate().back();
		 
	    //Test case 9
		//Directory
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a")).click();
    	Thread.sleep(3000);
    	
    	String title9 = driver.getTitle();
	    if(title9.equalsIgnoreCase("orangehrm")) {
	    	System.out.println("Test is passed");
	    }else {
	    	System.out.println("Test is failed");    	
	    }
	    WebElement element9 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		 String pageText9 = element9.getText();
		 String textToVerify9 = "Directory";
		 
		 if (pageText9.contains(textToVerify9)) {
	            System.out.println("" + textToVerify9  + " Matched");
	        } else {
	            System.out.println("" + textToVerify9  + " MisMatched");
}
		 driver.navigate().back();
		 
	    //Test case 10
		//Maintenance
       	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[10]/a/span")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[3]/div/div[2]/input")).sendKeys("admin123");
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[4]/button[2]")).click();
    	driver.navigate().back();
    	Thread.sleep(3000);
    	
    	String title10 = driver.getTitle();
	    if(title10.equalsIgnoreCase("orangehrm")) {
	    	System.out.println("Test is passed");
	    }else {
	    	System.out.println("Test is failed");    	
	    }
	    WebElement element10 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]"));
		 String pageText10 = element10.getText();
		 String textToVerify10 = "Maintenance";
		 
		 if (pageText10.contains(textToVerify10)) {
	            System.out.println("" + textToVerify10  + " Matched");
	        } else {
	            System.out.println("" + textToVerify10  + " MisMatched");
}
		 driver.navigate().back();
		 
	    //Test case 11
		//Claim
       	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a")).click();
    	Thread.sleep(3000);
    	
    	String title11 = driver.getTitle();
	    if(title11.equalsIgnoreCase("orangehrm")) {
	    	System.out.println("Test is passed");
	    }else {
	    	System.out.println("Test is failed");    	
	    }
	    WebElement element11 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		 String pageText11 = element11.getText();
		 String textToVerify11 = "Claim";
		 
		 if (pageText11.contains(textToVerify11)) {
	            System.out.println("" + textToVerify11  + " Matched");
	        } else {
	            System.out.println("" + textToVerify11  + " MisMatched");
}
		 driver.navigate().back();
		 
	    //Test case 12
		//Buzz
       	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a")).click();
    	Thread.sleep(3000);
    	
    	String title12 = driver.getTitle();
	    if(title12.equalsIgnoreCase("orangehrm")) {
	    	System.out.println("Test is passed");
	    }else {
	    	System.out.println("Test is failed");    	
	    }
	    WebElement element12 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		 String pageText12 = element12.getText();
		 String textToVerify12 = "Buzz";
		 
		 if (pageText12.contains(textToVerify12)) {
	            System.out.println("" + textToVerify12  + " Matched");
	        } else {
	            System.out.println("" + textToVerify12  + " MisMatched");
}
		 driver.navigate().back();  
      }
      
}






