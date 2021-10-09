package com.Oct_Mini_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul\\eclipse-workspace\\Selenium_Classes\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement mobiles = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
		Thread.sleep(3000);
		// mouse actions
		Actions ac = new Actions(driver);
		ac.contextClick(mobiles).build().perform();
		//keyboard actions
		Robot x = new Robot();
		x.keyPress(KeyEvent.VK_DOWN);
		x.keyRelease(KeyEvent.VK_DOWN);
		x.keyPress(KeyEvent.VK_ENTER);
		x.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement best_Seller = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
		ac.contextClick(best_Seller).build().perform();
		x.keyPress(KeyEvent.VK_DOWN);
		x.keyRelease(KeyEvent.VK_DOWN);
		x.keyPress(KeyEvent.VK_ENTER);
		x.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement fashion = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
		ac.contextClick(fashion).build().perform();
		x.keyPress(KeyEvent.VK_DOWN);
		x.keyRelease(KeyEvent.VK_DOWN);
		x.keyPress(KeyEvent.VK_ENTER);
		x.keyRelease(KeyEvent.VK_ENTER);
	}

}
