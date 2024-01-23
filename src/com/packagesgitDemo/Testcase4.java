package com.packagesgitDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase4 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.drive", "C:\\Users\\Public\\Desktop.firefox.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		
		driver.close();
		
	}

}
