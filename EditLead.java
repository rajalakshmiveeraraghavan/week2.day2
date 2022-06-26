package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("http://leaftaps.com/opentaps/control/login");
		cdriver.manage().window().maximize();
		WebElement username = cdriver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password = cdriver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = cdriver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement link = cdriver.findElement(By.linkText("CRM/SFA"));
		link.click();
		WebElement leads = cdriver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement create = cdriver.findElement(By.linkText("Create Lead"));
		create.click();
		WebElement companyname = cdriver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("IKEA");
		WebElement firstname = cdriver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Sudar");
		WebElement lastname = cdriver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("vannan");
		WebElement firstnamelocal = cdriver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstnamelocal.sendKeys("J");
		WebElement deptname = cdriver.findElement(By.id("createLeadForm_departmentName"));
		deptname.sendKeys("ECE");
		WebElement desc = cdriver.findElement(By.id("createLeadForm_description"));
		desc.sendKeys("Applicable");
		WebElement email = cdriver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("adj@gmail.com");
		WebElement state = cdriver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select province= new Select(state);
		province.selectByVisibleText("New York");
		WebElement createlead = cdriver.findElement(By.className("smallSubmit"));
		createlead.click();
		WebElement edit = cdriver.findElement(By.linkText("Edit"));
		edit.click();
		desc.clear();
		WebElement impnote = cdriver.findElement(By.id("updateLeadForm_importantNote"));
		impnote.sendKeys("changed the description");
		cdriver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println(cdriver.getTitle());
	
		
		
		
		
		
		
	}

}