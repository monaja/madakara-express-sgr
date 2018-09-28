package org.madaraka_express.implementations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.madaraka_express.entities.User;
import org.madaraka_express.services.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class userServicesImpl implements userServices {
@Autowired
private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void addUser(String email,String fName,String sName,
			String userName,String idNo, String passport,String	phone,
			String nationality,String password)
	{
 		Session currentSession = sessionFactory.getCurrentSession();
 		
		User user = new User();		
		user.setEmail(email);
		user.setfName(fName);
		user.setsName(sName);
		user.setUserName(userName);
		user.setid_no(idNo); 
		user.setPassport(passport);
		user.setPhone(phone);
		user.setPassword(password);
		user.setNationality(nationality); 		
		
	}
	
	@Override
	public void deleteUser(int id){
		//user = user.getUserId(id);
		//user.remove();
	}
//	public void updateUser(Long id){
//		
//	}
  

 
	@Override
	public User showUser(int id) {
 		return null;
	}

	@Override
	@Transactional
	public List<User> showUsers() {
 		Session currentSession = sessionFactory.getCurrentSession();
 		Query<User> tquery = currentSession.createQuery("from users", User.class);
 		List<User> users = tquery.getResultList();
		return users;
	}
}
