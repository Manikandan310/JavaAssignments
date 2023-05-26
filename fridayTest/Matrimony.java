package fridayTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 
		  driver.get("https://www.tamilmatrimony.in/");
		  
		  driver.manage().window().maximize();
		  
		  WebElement registermyself = driver.findElement(By.id("REGISTERED_BY"));
		  Select myself = new Select(registermyself);
		  myself.selectByVisibleText("Myself");
		 
		  WebElement name = driver.findElement(By.id("NAME"));
		  name.sendKeys("MANI C");
		  
		  WebElement gender = driver.findElement(By.xpath("//input[@value='M']"));
		  gender.click();
		  
		  WebElement day = driver.findElement(By.id("DOBDAY"));
		  Select day1=new Select(day);
		  day1.selectByVisibleText("3");
		  
		  WebElement month = driver.findElement(By.id("DOBMONTH"));
		  Select month1=new Select(month);
		  month1.selectByVisibleText("Feb");
		  
		  WebElement year = driver.findElement(By.id("DOBYEAR"));
		  Select year1=new Select(year);
		  year1.selectByVisibleText("2002");
	
		  WebElement religion = driver.findElement(By.id("RELIGION"));
		  Select religion1= new Select(religion);
		  religion1.selectByVisibleText("Hindu");
		  
		  WebElement mothertongue = driver.findElement(By.id("MOTHERTONGUE"));
		  Select mothertongue1= new Select(mothertongue);
		  mothertongue1.selectByVisibleText("Tamil");
		  
		  WebElement country = driver.findElement(By.id("COUNTRY"));
		  Select country1= new Select(country);
		  country1.selectByVisibleText("India");
		 
		  WebElement countryid = driver.findElement(By.id("M_COUNTRYCODE"));
		  Select countryid1= new Select(countryid);
		  countryid1.selectByVisibleText("+91");
		  
		  WebElement number = driver.findElement(By.id("MOBILENO"));
		  number.sendKeys("9597168039");
		
		  WebElement email = driver.findElement(By.id("EMAIL"));
		  email.sendKeys("8974512456");
		  
		  driver.close();
		  
		  
	}

}
