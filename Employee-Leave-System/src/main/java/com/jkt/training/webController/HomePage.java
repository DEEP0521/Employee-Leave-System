package com.jkt.training.webController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {

	@GetMapping(value = "/")
	public String Home() {
		return "index";
	}
}
