package tests;

import org.testng.annotations.Test;

import utils.Driver;
import utils.TestDataReader;

public class newt {
	
	
	@Test
	public void amazontest() {
		System.out.println("Marwan");
		Driver.getDriver().get(TestDataReader.getProperty("craterUrl"));
	}

}
