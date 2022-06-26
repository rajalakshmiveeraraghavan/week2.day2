package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
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
	WebElement CRMlink = cdriver.findElement(By.linkText("CRM/SFA"));
	CRMlink.click();
	WebElement leads = cdriver.findElement(By.linkText("Leads"));
	leads.click();
	WebElement createlead = cdriver.findElement(By.linkText("Create Lead"));
	createlead.click();
	WebElement companyname = cdriver.findElement(By.id("createLeadForm_companyName"));
	companyname.sendKeys("IBM");
	WebElement firstname = cdriver.findElement(By.id("createLeadForm_firstName"));
	firstname.sendKeys("sudar");
	WebElement lastname = cdriver.findElement(By.id("createLeadForm_lastName"));
	lastname.sendKeys("vannan");
	WebElement firstnamelocal = cdriver.findElement(By.id("createLeadForm_firstNameLocal"));
	firstnamelocal.sendKeys("J");
	WebElement deptname = cdriver.findElement(By.name("departmentName"));
	deptname.sendKeys("ABG");
	WebElement desc = cdriver.findElement(By.name("description"));
	desc.sendKeys("All mandatory fields are filled");
	WebElement email = cdriver.findElement(By.id("createLeadForm_primaryEmail"));
	email.sendKeys("rajaljdjd@gmail.com");
	WebElement state = cdriver.findElement(By.name("generalStateProvinceGeoId"));
	Select state1 = new Select(state);
	state1.selectByVisibleText("New York");
WebElement create = cdriver.findElement(By.className("smallSubmit"));
create.click();
System.out.println(cdriver.getTitle());
	
	
}
}
