package org.madaraka_express.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payment")
public class paymentControl {
	public String payment() {
		return "portal";
	}
	
	
}