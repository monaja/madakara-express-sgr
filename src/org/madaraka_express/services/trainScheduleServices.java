package org.madaraka_express.services;

public interface trainScheduleServices {
	public void addSchedule();
	public void deleteSchedule(Long id);
	public void showSchedule(Long id);
	public void changePriceStandard(Long id);
	public void changePriceFirstClass(Long id);
	
}
