package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrayPage {

	
	//Declaration
	@FindBy(id="loginClick")
	private WebElement loginlink;
	
	@FindBy(id="registerClick")
	private WebElement registerLink;
	
	@FindBy(name="firstname")
	private WebElement firstnameTF;
	
	@FindBy(name="lastname")
	private WebElement lastnameTF;
	
	@FindBy(xpath="//div[@class='row register-form']/div/div[2]/input[@name='email']")
	private WebElement emailTF;
	
	@FindBy(xpath="//div[@class='row register-form']/div[2]/div[2]/input[@name='password']")
	private WebElement passwordTF;
	
	@FindBy(name="repassword")
	private WebElement repasswordTF;
	
	@FindBy(xpath="//a[text()='I Already have a membership']")
	private WebElement iAlreadyhaveAMembershipLink;
	
	@FindBy(xpath="//a[text()=' Home']")
	private WebElement homeLink;
	
	@FindBy(name="signup")
	private WebElement registeBTN;
	
	//Initialization
	public SkillrayPage(WebDriver driver) {
	   PageFactory.initElements(driver,this); 
	}
	
	//Utilization
	public void clickresiterLink() {
		registerLink.click();
	}
	
	public void setFirstName(String firstName) {
		firstnameTF.sendKeys(firstName);
	}
	
	public void setLastName(String lastname) {
		lastnameTF.sendKeys(lastname);
		
	}
	
	public void setEmail(String email) {
		emailTF.sendKeys(email);
		
	}
	
	public void setPassword(String pass) {
		passwordTF.sendKeys(pass);
	}
	
	public void setRepassword(String repass) {
		repasswordTF.sendKeys(repass);
	}
	
	public void clickiAlreadyhaveAMembership() {
		iAlreadyhaveAMembershipLink.click();
	}
	
	public void clickHome() {
		homeLink.click();
	}
	
	public void clickresiter() {
		registeBTN.click();
	}
}

