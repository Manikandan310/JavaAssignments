package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) {
		ChromeDriver tab = new ChromeDriver();
		tab.get("https://acme-test.uipath.com/login");
		tab.manage().window().maximize();
		
		WebElement email=tab.findElement(By.id("email"));
		email.sendKeys("kumar.testleaf@gmail.com");
		
		WebElement password=tab.findElement(By.id("password"));
		password.sendKeys("leaf@12");
		
		WebElement login=tab.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		String pagetitle=tab.getTitle();
		System.out.println("Page title: "+pagetitle);
		
		WebElement logout=tab.findElement(By.linkText("Log Out"));
		logout.click();
		
		tab.close();
		
	}

}
