package com.aaronstechcenter.temperature;

public class Temperature {

	private double celcius;
	private double fahrenheit;
	
	public Temperature(double celcius, double fahrenheit) {
		this.celcius = celcius;
		this.fahrenheit = fahrenheit;
	}

	public double getCelcius() {
		return celcius;
	}

	public void setCelcius(double celcius) {
		this.celcius = celcius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
}
