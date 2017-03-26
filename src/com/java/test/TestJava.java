package com.java.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestJava {
  WebDriver driver = null;
	@Given("^User leaves mobile number field blank$")
	public void User_leaves_mobile_number_field_blank() throws Throwable {
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
	    System.setProperty("webdriver.ie.driver", "C:\\csd\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		//driver.get("http://google.co.in");
	    driver.get("file:///C:/Users/IBM_ADMIN/Desktop/registration.html");
	    
	    
	    //throw new PendingException();
	}

	@When("^clicks on submit button$")
	public void clicks_on_submit_button() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.id("b")).click();
	    //throw new PendingException();
	}

	@Then("^Displaying error message \"([^\"]*)\"$")
	public void Displaying_error_message(String expectedErrorMessage) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		String errorMessage = driver.switchTo().alert().getText();
		
		Assert.assertEquals(expectedErrorMessage, errorMessage);
	    throw new PendingException();
	}

	@Then("^User will be able to click on \"([^\"]*)\" button$")
	public void User_will_be_able_to_click_on_button(String arg1) throws Throwable {
	    boolean flag =driver.findElement(By.id("b")).isEnabled();
	    Assert.assertTrue(flag);
	    //throw new PendingException();
	}

	@Then("^User will be able to enter mobile number again$")
	public void User_will_be_able_to_enter_mobile_number_again() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Given("^User enter mobile number as \"([^\"]*)\"$")
	public void User_enter_mobile_number_as(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^Clicked on submit button$")
	public void Clicked_on_submit_button() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^User will be able to enter mobile number again Example \"([^\"]*)\"$")
	public void User_will_be_able_to_enter_mobile_number_again_Example(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^User will be able to enter mobile nunber again$")
	public void User_will_be_able_to_enter_mobile_nunber_again() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^User enter mobile number as (\\d+)$")
	public void User_enter_mobile_number_as(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^User click on submit button$")
	public void User_click_on_submit_button() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^Displaying message \"([^\"]*)\"$")
	public void Displaying_message(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^Display message \"([^\"]*)\"$")
	public void Display_message(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

}
