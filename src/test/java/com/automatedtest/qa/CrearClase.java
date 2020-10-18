package com.automatedtest.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.base.Base;
import com.project.base.GlobalVariables;
import com.project.poclasses.Login;

public class CrearClase {

	WebDriver driver;
	Base base;
	Login login;
	
	@BeforeTest
	public void beforeTest() {
		base = new Base(driver);
		driver = base.chromedriverConnection();
		login = new Login(driver);
	}

	@Test
	public void TestCase001() {
		
		base.launchBrowser(GlobalVariables.MAIN_URL);
		
		login.IniciarSesion();
	}

	@AfterTest
	public void afterTest() {
	}

}
