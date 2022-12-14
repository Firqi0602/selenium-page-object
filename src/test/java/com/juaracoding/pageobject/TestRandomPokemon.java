package com.juaracoding.pageobject;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.RandomPokemon;

public class TestRandomPokemon {
		public static WebDriver driver;
		private RandomPokemon randomPokemon;

		@BeforeClass
		public void setUp() {
			DriverSingleton.getInstance("Firefox");
			WebDriver driver = DriverSingleton.getDriver();
			String url = "https://randompokemon.com/";
			driver.get(url);
		}

		@BeforeMethod
		public void pageObject() {
			randomPokemon = new RandomPokemon();
		}

		@Test
		public void TestInvalidLogin() {
			randomPokemon.generatePokemon();
			
		}

		@AfterClass
		public void closeBrowser() {
			delay(3);
			driver.quit();
		}

		static void delay(int detik) {
			try {
				Thread.sleep(1000 * detik);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


