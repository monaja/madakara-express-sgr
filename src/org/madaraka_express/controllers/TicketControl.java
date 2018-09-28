package org.madaraka_express.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ticket/")
public class TicketControl {
	
	//here the user can cancel a print a ticket
	//return to portal
	
	@RequestMapping("/print-ticket")
	public String cancelTicket() {
		
		return "printing";
	}
	
 
	@RequestMapping("/return-portal")
	public String signOut() {
		
		return "portal";
	}

}
