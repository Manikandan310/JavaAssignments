package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		ChromeDriver tab = new ChromeDriver();
		tab.get("http://leaftaps.com/opentaps/control/login");
		tab.manage().window().maximize();
		
		WebElement username = tab.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		WebElement password = tab.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement submitbutton =tab.findElement(By.className("decorativeSubmit"));
		submitbutton.click();
		
		WebElement crmsfa =tab.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		
		WebElement contacts =tab.findElement(By.linkText("Contacts"));
		contacts.click();
		
		WebElement create = tab.findElement(By.linkText("Create Contact"));
		create.click();
		
		WebElement firstname = tab.findElement(By.id("firstNameField"));
		firstname.sendKeys("Mani");
		
		WebElement lastname = tab.findElement(By.id("lastNameField"));
		lastname.sendKeys("C");
		
		WebElement firstnamelocal = tab.findElement(By.id("createContactForm_firstNameLocal"));
		firstnamelocal.sendKeys("Manikandan");
		
		WebElement lastnamelocal = tab.findElement(By.id("createContactForm_lastNameLocal"));
		lastnamelocal.sendKeys("Chandru");
		
		WebElement department = tab.findElement(By.id("createContactForm_departmentName"));
		department.sendKeys("CSE");
		
		WebElement description = tab.findElement(By.id("createContactForm_description"));
		description.sendKeys("NA");
		
		WebElement email = tab.findElement(By.id("createContactForm_primaryEmail"));
		email.sendKeys("manikandan.cs19@bitsathy.ac.in");
		
		WebElement state = tab.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		state.sendKeys("New York");
		
		WebElement submit = tab.findElement(By.className("smallSubmit"));
		submit.click();
		
		WebElement edit = tab.findElement(By.linkText("Edit"));
		edit.click();
		
		WebElement description1 = tab.findElement(By.id("updateContactForm_description"));
		description1.clear();
		
		WebElement impNote = tab.findElement(By.id("updateContactForm_importantNote"));
		impNote.sendKeys("Nothing");
		
		WebElement submit1 = tab.findElement(By.className("smallSubmit"));
		submit1.click();
		
		String resultPageTitle = tab.getTitle();
		System.out.println("resultPageTitle : " +resultPageTitle);
		
		
		
		
	
		
	}

}
