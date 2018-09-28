package org.madaraka_express.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class bookingControl{

@RequestMapping("/booking")	
public String showBookingForm() {
		return "booking-page";
	}
@RequestMapping("/booking-confirm")
public String bookingConfirm() {
		
		return "passenger-form";
	}
 

@RequestMapping("/passenger-form-confirm")
public String passengerConfirm() {
		
		return "ticketView";
	}
	
 
	
	
	
	
	
}