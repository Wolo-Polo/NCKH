package NCKH.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	@RequestMapping(value = "api/test", method = RequestMethod.GET)
	public String getTestString() {
		return "test";
	}
}
