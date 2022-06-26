package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.manage().window().maximize();
	cdriver.get("http://leaftaps.com/opentaps/control/login");
	WebElement username = cdriver.findElement(By.id("username"));
	WebElement password = cdriver.findElement(By.id("password"));
WebElement login = cdriver.findElement(By.className("decorativeSubmit"));
username.sendKeys("Demosalesmanager");
password.sendKeys("crmsfa");
login.click();
WebElement crm = cdriver.findElement(By.linkText("CRM/SFA"));
crm.click();
WebElement leads = cdriver.findElement(By.linkText("Leads"));
leads.click();
WebElement create = cdriver.findElement(By.linkText("Create Lead"));
create.click();
WebElement company = cdriver.findElement(By.id("createLeadForm_companyName"));
WebElement firstname = cdriver.findElement(By.id("createLeadForm_firstName"));
WebElement lastname = cdriver.findElement(By.id("createLeadForm_lastName"));
WebElement firstnamelocal = cdriver.findElement(By.id("createLeadForm_firstNameLocal"));
company.sendKeys("UEYHE"); firstname.sendKeys("qwertutue"); lastname.sendKeys("hiyn");firstnamelocal.sendKeys("ibibibk");
WebElement createlead = cdriver.findElement(By.className("smallSubmit"));
createlead.click();
System.out.println(cdriver.getTitle());
WebElement duplicate = cdriver.findElement(By.linkText("Duplicate Lead"));
duplicate.click();
WebElement comp = cdriver.findElement(By.id("createLeadForm_companyName"));
comp.clear(); comp.sendKeys("ubdinddmkmfl");
WebElement firstname1 = cdriver.findElement(By.id("createLeadForm_firstName"));
firstname1.clear(); firstname1.sendKeys("omlmjh8ijjj");
cdriver.findElement(By.className("smallSubmit")).click();
System.out.println(cdriver.getTitle());




}
}
