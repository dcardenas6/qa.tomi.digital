package com.project.poclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.base.Base;

public class Login extends Base{

	public Login(WebDriver driver) {
		super(driver);
	}
	
	By txt_user = By.xpath("//input[@type='username']");
	By txt_password = By.xpath("//input[@type='password']");
	By btn_iniciar = By.xpath("//button[@type='submit']");
	String email_user = "dcardenas@aulasamigas.com";
	String pass_user = "123456";
	
	public void IniciarSesion(){
		
		waitForElementPresent(txt_user);
		insertText(txt_user, email_user);
		insertText(txt_password, pass_user);
		click(btn_iniciar);
	}
	
}
