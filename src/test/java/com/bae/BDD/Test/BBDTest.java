package com.bae.BDD.Test;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BBDTest {
	public static WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
		
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait waitWeb = (new WebDriverWait(driver, 10));
		
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
		searchBox.sendKeys(arg1);
		searchBox.submit();
		waitWeb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sb_form\"]/div")));
	    
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverWait waitResults = (new WebDriverWait(driver, 10));
		waitResults.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"b_results\"]")));
	    WebElement searchItems = driver.findElement(By.xpath("//*[@id=\"b_results\"]"));
	    assertTrue(searchItems.isDisplayed());
	}

	
	
	
	/*
	@Given("^the correct web address$") //do not edit these!!!
	public void the_correct_web_address()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://www.practiceselenium.com/welcome.html");
		
		
	} 

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement menuElement = driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
		//WebElement menuElement = driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[1]/div[2]/div[1]/a/img"));
		menuElement.click();
		menuElement = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914921\"]/div/h1"));
		
		
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
	    // Write code here that turns the phrase above into concrete actions
		int browseCount = 0;
		
	   WebElement browseElement = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong"));
	   
	   browseElement = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong"));
	   
	   browseElement = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231735\"]/div/p/span/span/strong"));
	   
	   
	  
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}*/
	
	
	
}
