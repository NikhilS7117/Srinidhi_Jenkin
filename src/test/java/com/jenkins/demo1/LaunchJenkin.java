package com.jenkins.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchJenkin 
{
	@Test
	public void launchTest()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		
		String title= driver.getTitle();
		System.out.println("Title : "+title);
		driver.close();
	}
}
