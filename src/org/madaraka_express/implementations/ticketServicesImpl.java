package org.madaraka_express.implementations;
import java.util.List;
import org.madaraka_express.entities.Tickets;
import org.madaraka_express.services.ticketServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ticketServicesImpl implements ticketServices {
	
	 
	@Override
	public Tickets showTicket(int id) {
		
		return null;
	}
	
	@Override
	public List<Tickets> showTickets() {
		
		  return null;
	}
	
	@Override
	public List<Tickets> showTickets(int id) {		
		  return null;
	}
	
	@Override
	public int showStatus(int id) {
		return 0;
	}
	
	@Override
	public void cancelTicket(int id) {
		
	}

 
 
}
