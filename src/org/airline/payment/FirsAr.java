package org.airline.payment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FirsAr {
	
	public static void main(String[] args) throws InterruptedException, AWTException { 
	//Automate until Payment Page
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\FirstAir\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://firstair.ca/");
		driver.manage().window().maximize();
	//****PAGEG ONE***FINDING ROUTE************************************************************************
		
		WebElement sourceSel = driver.findElement(By.xpath("(//select[@name='origin'])[1]"));
		sourceSel.click();
		Select select = new Select(sourceSel);
		select.selectByIndex(7);
		WebElement destSel = driver.findElement(By.xpath("(//select[@name='destination'])[1]"));
		destSel.click();
		Select select2 = new Select(destSel);
		select2.selectByIndex(9);
		WebElement btnOneWay = driver.findElement(By.xpath("(//input[@id='journeySpan'])[2]"));
		btnOneWay.click();
		WebElement dateBtn = driver.findElement(By.id("departureDate"));
		dateBtn.click();
		WebElement dateBtn2 = driver.findElement(By.xpath("(//a[text()='22'])[1]"));
		dateBtn2.click();
		WebElement findFlight = driver.findElement(By.xpath("(//a[text()='Find Flights'])[1]"));
		findFlight.click();
	//**PAGE TWO***SELECT FLIGHT*************************************************************************
		Thread.sleep(8000);
		WebElement flightSel = driver.findElement(By.xpath("//div[text()='From']"));
		flightSel.click();
		Thread.sleep(3000);	
		WebElement flightSel2 = driver.findElement(By.xpath("(//button[@type='button'])[24]"));
		flightSel2.click();
	//**PAGE THREE***PASSENGER FLIGHT SELECTION*********************************************************
		
		Thread.sleep(8000);
		WebElement passBtn = driver.findElement(By.xpath("//button[text()='Passengers']"));
		passBtn.click();
		Thread.sleep(4000);
		WebElement mr = driver.findElement(By.id("react-select-9--value"));
		mr.click();
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement frstName = driver.findElement(By.id("firstNamePassengerItemAdt1BasicInfoEditFirstName-passenger-item-ADT-1-basic-info-edit"));
		frstName.sendKeys("Mohamed");
		WebElement secName = driver.findElement(By.id("lastNamePassengerItemAdt1BasicInfoEditLastName-passenger-item-ADT-1-basic-info-edit"));
		secName.sendKeys("Raseem");
		
		WebElement dateElmnt = driver.findElement(By.id("react-select-10--value-item"));
		dateElmnt.click();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement mnthElmnt = driver.findElement(By.id("react-select-11--value-item"));
		mnthElmnt.click();
		for (int i = 0; i < 2; i++) {
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		WebElement yearElmnt = driver.findElement(By.id("react-select-12--value-item"));
		yearElmnt.click();
		for (int i = 0; i < 12; i++) {
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		WebElement phnNo = driver.findElement(By.id("phone0Input-0-required-passenger-item-ADT-1-0"));
		phnNo.sendKeys("9442932436");
		
		WebElement email1 = driver.findElement(By.xpath("(//input[@id='emailRequiredPassengerItemAdt1Email-required-passenger-item-ADT-1'])[1]"));
		email1.sendKeys("raseem.moha@gmail.com");
		
		
		WebElement emailCnfrm = driver.findElement(By.xpath("(//input[@id='confirmEmailRequiredPassengerItemAdt1ConfirmEmail-required-passenger-item-ADT-1'])[1]"));
		emailCnfrm.sendKeys("raseem.moha@gmail.com");
		
		
		WebElement skpSeat = driver.findElement(By.xpath("//button[@id='dxp-passenger-view-skip']"));
		skpSeat.click();
		
	//**NEXT PAGE**PAYMENT PAGE*************************************************************************************
		Thread.sleep(5000);
		WebElement credCard = driver.findElement(By.id("creditCardNumberField"));
		credCard.sendKeys("23345656");
		
		WebElement hldrName = driver.findElement(By.id("credit-card-holderName"));
		hldrName.sendKeys("Mohamed Raseem");
		
		WebElement expDate = driver.findElement(By.id("credit-card-expiration-date"));
		expDate.sendKeys("122020");
		
		WebElement cvNo = driver.findElement(By.id("credit-card-cvc"));
		cvNo.sendKeys("345");
		
		WebElement str = driver.findElement(By.id("credit-card-street1"));
		str.sendKeys("kjkasjdkj");
		
		WebElement countrySel = driver.findElement(By.id("react-select-15--value"));
		countrySel.click();
		for (int i = 0; i < 12; i++) {
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement crdCity = driver.findElement(By.id("credit-card-city"));
		crdCity.sendKeys("chennai");
		
		
		
		
		
		
		
		
		}
}
