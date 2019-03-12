package BrowserTestingAndroid;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidTest {


	public static AndroidDriver<AndroidElement> Capabilities()throws MalformedURLException{
		

			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
			cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");


			//  set up connection with Server Appium
			
			AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

			return driver;
			/// UIANDRIOD AUTOMATIO : To get Object specfic path 
			
			

		}
		

}
