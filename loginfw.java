package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class loginfw extends BaseTest {

	@Test
	public static void logintest() throws InterruptedException {


		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#username")).clear();
		driver.findElement(By.cssSelector("input#username")).sendKeys("tester_123@yopmail.com");

		driver.findElement(By.cssSelector("input#password")).clear();
		driver.findElement(By.cssSelector("input#password")).sendKeys("ABC12345678");

		driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
		Thread.sleep(5000);
		WebElement dropdown1 = driver.findElement(By.id("dropdownUser1"));
		dropdown1.click();

		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);

		System.out.println("User logged out successfully");
		System.out.println("--------------------------------");  








	}

}
