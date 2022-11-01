package com.aaronstechcenter.temperature;

public class TemperatureLogic {

	public static double computeFahrenheit(double celcius) {
		return (celcius * 9 / 5) + 32;
	}
	
	public static double computeCelcius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9; 
	}
}
