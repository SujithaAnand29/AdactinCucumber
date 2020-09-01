package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	public static WebDriver driver;

	@FindBy(xpath = "(//input[@class='login_input'])[1]")
	private WebElement Username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginBtn;

	public SignInPage(WebDriver ldriver) {
			this.driver=ldriver;
			PageFactory.initElements(driver, this);	
		}
	public static Object getSignInPage(SignInPage SignInPage) {
	     return (SignInPage == null) ? new SignInPage(driver) : SignInPage;
	}
	public WebElement getUserName() {
		return Username;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getPassword() {
		return password;
	}

}
