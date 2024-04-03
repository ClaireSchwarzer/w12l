package org.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoubleNumberController {

	@GetMapping("/double")
	public int doubleNumber(@RequestParam(value = "number") int number) {
		return number * 2;
	}
}
