package testCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class GithubLoginCreateRepositary extends BaseDriver {
	String baseUrl = "https://github.com/";

	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Click on Sign in
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(1000);

		//Type Email
		driver.findElement(By.name("login")).sendKeys("unknown71360@gmail.com");
		Thread.sleep(1000);
		
		
		//Type Password
		driver.findElement(By.name("password")).sendKeys("Qa2022pass");
		Thread.sleep(1000);
		
		//Click on sign in button
		driver.findElement(By.xpath("//body/div[3]/main[1]/div[1]/div[4]/form[1]/div[1]/input[12]")).click();
		Thread.sleep(5000);
		
		//Click on new button
		driver.findElement(By.xpath("//body/div[5]/div[1]/aside[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")).click();
		Thread.sleep(1000);
		
		//Input repository name
		driver.findElement(By.xpath("//input[@id='repository_name']")).sendKeys("qa-assignment");
		Thread.sleep(1000);
		
		//Check gitignore
		driver.findElement(By.xpath("//span[contains(text(),'.gitignore template:')]")).click();
		Thread.sleep(1000);
		
		//Scroll down to Node
		WebElement e=driver.findElement(By.xpath("//div[contains(text(),'Node')]"));
		js.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(1000);

		//Select Node
		driver.findElement(By.xpath("//div[contains(text(),'Node')]")).click();
		Thread.sleep(1000);
		
		//Click on create repository
		driver.findElement(By.xpath("//button[contains(text(),'Create repository')]")).click();
		Thread.sleep(5000);
		
		//Verify repository name
		String text=driver.findElement(By.xpath("//a[contains(text(),'qa-assignment')]")).getText();
	    System.out.println("Name of repo is\t" +text);
		Thread.sleep(1000);
		
		//Click on profile icon
		driver.findElement(By.xpath("//header/div[7]/details[1]/summary[1]/img[1]")).click();
		Thread.sleep(1000);
		
		//Sign out
		driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
		Thread.sleep(1000);
	}
}

//Qa2022pass //SQA Project