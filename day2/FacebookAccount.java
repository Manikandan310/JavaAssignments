package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {
	public static void main(String[] args) throws InterruptedException {
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://en-gb.facebook.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  WebElement CreateNewAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		  CreateNewAccount.click();
		  
		  WebElement name = driver.findElement(By.name("firstname"));
		  name.sendKeys("XXXXXX");
		  
		  WebElement lastname = driver.findElement(By.name("lastname"));
		  lastname.sendKeys("Y");
		  
		  WebElement mail = driver.findElement(By.name("reg_email__"));
		  mail.sendKeys("XXXY3102@Gmail.com");
		  
		  WebElement remail = driver.findElement(By.name("reg_email_confirmation__"));
		  remail.sendKeys("XXXY3102@Gmail.com");
		  
		  WebElement password = driver.findElement(By.name("reg_passwd__"));
		  password.sendKeys("dsag1122!");
		  
		  WebElement day = driver.findElement(By.name("birthday_day"));
		  Select day1=new Select(day);
		  day1.selectByVisibleText("3");
		  
		  WebElement month = driver.findElement(By.name("birthday_month"));
		  Select month1=new Select(month);
		  month1.selectByVisibleText("Jan");
		  
		  WebElement year = driver.findElement(By.name("birthday_year"));
		  Select year1=new Select(year);
		  year1.selectByVisibleText("2002");
		  
		  WebElement gender = driver.findElement(By.name("sex"));
		  gender.click();
		  
		  WebElement create=driver.findElement(By.name("websubmit"));
		  create.click();
		  
		  Thread.sleep(30000);
		  
		  driver.close();
		  
		  
		 }

}
