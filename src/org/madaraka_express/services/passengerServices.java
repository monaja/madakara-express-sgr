package org.madaraka_express.services;
import org.madaraka_express.entities.Passengers;

import java.util.List;

public interface passengerServices {
	public void addPassenger(String email,String fName,String lName,
			String userName,String idNo, String passport,String	phone,
			String nationality);
 	public void deletePassenger(int id);
	//public void deletePassengers(List Passengers);
	//public void updatePassenger();
	public Passengers showPassenger(int id);
	public List<Passengers> showPassengers();
	//public void addPassengers(List Passengers);
 	
	

}
