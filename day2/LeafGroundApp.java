package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundApp {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("j_idt88:name")).sendKeys("Manikandan");
		
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys(",India.");
		
		boolean textBoxDisable = driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
		System.out.println(textBoxDisable);
		
		WebElement clear = driver.findElement(By.name("j_idt88:j_idt95"));
		clear.clear();
		
		String retrievedText = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		driver.findElement(By.id("j_idt88:j_idt97")).sendKeys(Keys.TAB);
		
		driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("mani@gmail.com");

		WebElement age = driver.findElement(By.name("j_idt106:thisform:age"));
		age.click();
		
		String actual_msg = driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).getText();
		
		

			
		}
		
		
		}
		
	
	

