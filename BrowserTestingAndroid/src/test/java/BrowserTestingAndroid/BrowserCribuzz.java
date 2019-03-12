package BrowserTestingAndroid;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class BrowserCribuzz extends AndroidTest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();   
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		 driver.get("https://www.cricbuzz.com/");
		 driver.findElementByXPath("//span[contains(text(),'Menu')]").click();
		 Thread.sleep(1000);

		 driver.findElementByXPath("//a[contains(text(),'Home')]").click();
		 Thread.sleep(1000);

		 System.out.println(driver.getCurrentUrl());
		 
		 /// agr muzeBrowser pay Scroll krna hey to kaise lene ka ye way say
		 
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 
		 jse.executeScript("window.scrollBy(0,480)","");
		 Thread.sleep(1000);
		 
		 
		 //agr ye path ismay hoga to assert true hoga  basicall assert true say hm boolean result lete he true or false may
		 Assert.assertTrue(driver.findElementByXPath("//h4[contains(text(),'Top Stories')]").getAttribute("class").contains("header"));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	     
	     
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	     
	     
		
	}
		
		
		
		
	}


