package org.madaraka_express.services;
import java.util.List;

import org.madaraka_express.entities.User;
 
import org.springframework.stereotype.Service;

 
public interface userServices {
	
	public void addUser(String email,String fName,String lName,
			String userName,String idNo, String passport,String	phone,
			String nationality,String password);
	
	public void deleteUser(int id);
	
	//public void updateUser(int id);
	
	public User showUser(int id);
	
	public List<User> showUsers();	
	
}
