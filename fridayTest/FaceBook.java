package fridayTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  WebElement CreateNewAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		  CreateNewAccount.click();
		  
		  WebElement name =driver.findElement(By.name("firstname"));
		  name.sendKeys("Mani");
		  
		  WebElement lastname = driver.findElement(By.name("lastname"));
		  lastname.sendKeys("C");
		  
		  WebElement mail = driver.findElement(By.name("reg_email__"));
		  mail.sendKeys("9874562478");
		  
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
		  
		  driver.close();
		  
		  
		  
	}

}
