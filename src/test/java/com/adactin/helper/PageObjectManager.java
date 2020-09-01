package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.HotelConfirmation;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.pom.SignInPage;

public class PageObjectManager {

	public static WebDriver driver;

	private SearchHotel sh;
	private SelectHotel s1;
	private HotelConfirmation hc;
	private SignInPage sp;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;

	}

	public SignInPage getSp() {
		sp = new SignInPage(driver);
		return sp;
	}

	public SearchHotel getSh() {
		sh = new SearchHotel(driver);
		return sh;
	}

	public SelectHotel getS1() {
		s1 = new SelectHotel(driver);
		return s1;
	}

	public HotelConfirmation getHc() {
		hc = new HotelConfirmation(driver);
		return hc;
	}

}
