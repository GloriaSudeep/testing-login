package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class nocredentials extends BaseTest {
	@Test 
	public static void logintest() throws InterruptedException {
		// driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#username")).sendKeys(" ");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#password")).sendKeys(" ");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
		Thread.sleep(4000);
		// Displays error message when entering credentials which are not signedup
		WebElement m= driver.findElement(By.cssSelector("div.alert.alert-danger"));
		String act = m.getText();
		 System.out.println("Login without credentials");  
		System.out.println("Error message is: "+ act);
		System.out.println("--------------------------------");  

	}}
