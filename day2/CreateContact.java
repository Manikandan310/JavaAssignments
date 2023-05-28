package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
        
                WebElement password = driver.findElement(By.id("password"));
                password.sendKeys("crmsfa");
        
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		
		WebElement contactButton = driver.findElement(By.linkText("Contacts"));
		contactButton.click();
		
		WebElement createContactButton = driver.findElement(By.linkText("Create Contact"));
		createContactButton.click();
		
		WebElement firstName = driver.findElement(By.id("firstNameField")); 
		firstName.sendKeys("Manikandan");
		
		WebElement lastName = driver.findElement(By.id("lastNameField")); 
		lastName.sendKeys("C");
		
		WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstNameLocal.sendKeys("Mani");
		
		WebElement lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastNameLocal.sendKeys("Chandru");
	
		WebElement departName = driver.findElement(By.id("createContactForm_departmentName"));
		departName.sendKeys("software testing");
	
	        WebElement description = driver.findElement(By.id("createContactForm_description"));
		description.sendKeys("To find defects");
	
		WebElement email = driver.findElement(By.id("createContactForm_primaryEmail"));
		email.sendKeys("mani.3102@gmail.com");
	
		WebElement stateOrProvince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	        Select state=new Select(stateOrProvince) ;
                state.selectByVisibleText("New York");
	
                WebElement submit = driver.findElement(By.name("submitButton"));
		submit.click();
        
		WebElement edit = driver.findElement(By.className("subMenuButton"));
		edit.click();
		
		WebElement clearDes = driver.findElement(By.id("updateContactForm_description"));
		clearDes.clear();
		
		WebElement importantNote = driver.findElement(By.id("updateContactForm_importantNote"));
		importantNote.sendKeys("Thank you");
		
		WebElement update = driver.findElement(By.xpath("//input[@value='Update']"));
		update.click();
		
		System.out.println(driver.getTitle());
        
	
	}
	
	

}
