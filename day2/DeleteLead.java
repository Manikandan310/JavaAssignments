package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		
		WebElement leads =tab.findElement(By.linkText("Leads"));
		leads.click();
		
		WebElement find =tab.findElement(By.linkText("Find Leads"));
		find.click();
		
		WebElement phone = tab.findElement(By.linkText("Phone"));
        phone.click();
        
        WebElement phoneNo = tab.findElement(By.name("phoneNumber"));
        phoneNo.sendKeys("9874561245");
        
        WebElement findLeadButton = tab.findElement(By.xpath("//button[text()='Find Leads']"));
        findLeadButton.click();
        
        WebElement leadid = tab.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tr[1]//td[1])[1]//a"));
        System.out.println(leadid.getText());
        leadid.click();
        
        WebElement delete = tab.findElement(By.xpath("//a[text()='Delete']"));
        delete.click();
        tab.close();
	}

}
