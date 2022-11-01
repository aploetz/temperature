package com.aaronstechcenter.temperature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemperatureLogicTests {

	@Test
	void testCelciusZero() {
		double celcius = TemperatureLogic.computeCelcius(32);
		
		assertEquals(celcius,0);
	}
	
	@Test
	void testFahrenheit32() {
		double fahrenheit = TemperatureLogic.computeFahrenheit(0);
		
		assertEquals(fahrenheit,32);
	}
}
