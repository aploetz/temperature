package com.aaronstechcenter.temperature;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

	@GetMapping("/fahrenheit/from/{tempInCelcius}")
	public ResponseEntity<Temperature> getFahrenheit(HttpServletRequest req, @PathVariable(value="tempInCelcius") double tempInCelcius) {
		double tempInFahrenheit = TemperatureLogic.computeFahrenheit(tempInCelcius);
		Temperature temp = new Temperature(tempInCelcius,tempInFahrenheit);
		
		return ResponseEntity.ok(temp);
	}

	@GetMapping("/celcius/from/{tempInFahrenheit}")
	public ResponseEntity<Temperature> getCelcius(HttpServletRequest req, @PathVariable(value="tempInFahrenheit") double tempInFahrenheit) {
		double tempInCelcius = TemperatureLogic.computeCelcius(tempInFahrenheit);
		Temperature temp = new Temperature(tempInCelcius,tempInFahrenheit);
		
		return ResponseEntity.ok(temp);
	}
}
