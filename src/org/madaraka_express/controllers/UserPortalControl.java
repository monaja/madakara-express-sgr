package org.madaraka_express.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserPortalControl{

	@RequestMapping("/view-ticket")
	public String viewTicket() {
			
			return "/view-tickets";
		}
	
	@RequestMapping("/return")
	public String cancelTicket() {
		
		return "portal";
	}
	
	@RequestMapping("/sign-out")
	public String signOut() {
		
		return "log-in";
	}
	
	@RequestMapping("/cancel-ticket")
	public String stopTicket() {
		
		return "confirm-canel-ticket";
	}
	
	@RequestMapping("/confirm-cancel-ticket")
	public String cancelTicketConfirmt() {
		
		return "portal";
	}
	
	
}