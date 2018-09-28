package org.madaraka_express.controllers;



import java.util.List;

import org.madaraka_express.entities.Tickets;
import org.madaraka_express.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.madaraka_express.implementations.ticketServicesImpl;
import org.madaraka_express.implementations.userServicesImpl;
import org.madaraka_express.services.ticketServices;
import org.madaraka_express.services.userServices;

@Controller
public class homeControl {
@Autowired
private userServices  userservicesImpl;
 
@RequestMapping("/")
public String showHomepageP(Model lmodel) {
	List<User> users = userservicesImpl.showUsers();
	lmodel.addAttribute("users",users);
	return "home-page";
}

@RequestMapping("/payment-form")
public String paymentForm() {
	return "payment-form";
}

@RequestMapping("/payment")
public String paymentConfirm(Model myModel) {
	List <Tickets> tickets;		
	return "portal";
}




@RequestMapping("/payment-cancel")
public String paymentCancel() {
	return "portal";
}

@GetMapping("/sign-in-form")
public String signIn(Model model) {
	User user = new User();
	model.addAttribute("user", user);
	return "sign-in";
	
}

@PostMapping("/sign-in")
public String signInConfirm(@ModelAttribute("user") User user) {
	
	//if details correct go to portal return "portal" 
	//esle if details wrong then signin form
	
   if(true) {
		return "portal";
	}
	
	return "sign-in";
}

@RequestMapping("/sign-up")
public String signUpConfirm(Model model) {
	User user = new User();
	model.addAttribute("user", user);
	return "sign-up";
}

@RequestMapping("/sign-up-form")
public String signUp() {
	//if details correct go to portal return "portal" 
		//esle if details wrong then signUp form
	return "sign-up";
}

@RequestMapping("list")
public String listUsers(Model lmodel) { 
	List<User> users = userservicesImpl.showUsers();
	lmodel.addAttribute("users",users);
	
	return "system-users";
} 


}
