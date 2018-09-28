package org.madaraka_express.services;

public interface paymentServices {
	public void addPayment();
	public void activatePayment(Long id);
	public void reversePayment(Long id);
	
}
