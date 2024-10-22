package com.WebDriverDemos;
//TC: Open Google and Search for Automation jobs for freshers and hit enter

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocateByClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.className("gLFyf"));
		searchBox.sendKeys("Automation jobs for freshers");
		searchBox.sendKeys(Keys.ENTER);
		
		String title = driver.getTitle();
		
		if(title.contains("Automation jobs for freshers"))
			System.out.println("Correct Search Result Displayed");
		else
			System.out.println("Getting wrong result");
	}

}