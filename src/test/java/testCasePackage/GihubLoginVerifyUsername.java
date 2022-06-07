package testCasePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class GihubLoginVerifyUsername extends BaseDriver {
	String baseUrl = "https://github.com/";

	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//Click on Sign in
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(5000);

		//Type Email
		driver.findElement(By.name("login")).sendKeys("unknown71360@gmail.com");
		Thread.sleep(1000);
		
		//Type Password
		driver.findElement(By.name("password")).sendKeys("Qa2022pass");
		Thread.sleep(1000);
		
		//Click on sign in button
		driver.findElement(By.xpath("//body/div[3]/main[1]/div[1]/div[4]/form[1]/div[1]/input[12]")).click();
		Thread.sleep(5000);
		
		//Click on profile icon
		driver.findElement(By.xpath("//header/div[7]/details[1]/summary[1]/img[1]")).click();
		Thread.sleep(5000);
		
		//Verify that the right username
		String text=driver.findElement(By.xpath("//header/div[7]/details[1]/details-menu[1]/div[1]/a[1]/strong[1]")).getText();
	    System.out.println("Signed in as\t" +text);
		Thread.sleep(5000);
		
		//Sign out
		driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
		Thread.sleep(5000);
	}
}