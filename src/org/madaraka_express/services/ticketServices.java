package org.madaraka_express.services;

import java.util.List;

import org.madaraka_express.entities.Tickets;

public interface ticketServices {
	
	public Tickets showTicket(int id);
	
	public List<Tickets> showTickets();
	
	public int showStatus(int id);
	
 	public void cancelTicket(int id);
 	
 	public List<Tickets> showTickets(int id);
	
}
