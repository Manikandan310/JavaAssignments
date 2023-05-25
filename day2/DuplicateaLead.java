package week3.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateaLead {
	public static void main(String[] args) {
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://leaftaps.com/opentaps/control/login");
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  WebElement username = driver.findElement(By.id("username"));
		  username.sendKeys("DemoSalesManager");

		  WebElement password = driver.findElement(By.id("password"));
		  password.sendKeys("crmsfa");
		  WebElement login = driver.findElement(By.className("decorativeSubmit"));
		  login.click();
		  WebElement crmsfa = driver.findElement(By.id("label"));
		  crmsfa.click();

		  WebElement leadButton = driver.findElement(By.linkText("Leads"));
		  leadButton.click();

		  WebElement findlead = driver.findElement(By.linkText("Find Leads"));
		  findlead.click();
		        
		  WebElement email = driver.findElement(By.linkText("Email"));
		  email.click();

		  WebElement typeEmail = driver.findElement(By.xpath("//input[@name='emailAddress']"));
		  typeEmail.sendKeys("mani3102@gmail.com");

	      WebElement findLeadButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		  findLeadButton.click();
		        
		  WebElement nameOfThe1stLead = driver.findElement(By.xpath("//a[text()='Mani'][1]"));
		  String text = nameOfThe1stLead.getText();
		        
		  System.out.println(text);
		  nameOfThe1stLead.click();

		  WebElement duplicate = driver.findElement(By.linkText("Duplicate Lead"));
		  duplicate.click();
	
		  String title = driver.getTitle();
		  System.out.println(title);
		        
		  if(title.contains("Duplicate Lead")){
		  System.out.println("title is verified");
		  }
		  WebElement submit = driver.findElement(By.name("submitButton"));
		  submit.click();

		  WebElement dName = driver.findElement(By.id("viewLead_firstName_sp"));
		  String text1 = dName.getText();
		  if(text1.equals(text)) {
		  System.out.println("both names are same");
		  }
		  driver.quit();
		        

		 }

		}

