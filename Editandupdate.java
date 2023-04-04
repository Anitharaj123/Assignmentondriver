package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editandupdate {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement companyname=driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("Leaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvaraj");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anuselvaraj6594@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement upcompanyname=driver.findElement(By.id("updateLeadForm_companyName"));
		upcompanyname.clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("submitButton")).click();
		
	}
}
