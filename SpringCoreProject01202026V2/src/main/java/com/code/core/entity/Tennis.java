package com.code.core.entity;

public class Tennis implements ICoach{
	private String name;
	private String emailId;
	private IFortune fortune;
	
	public Tennis() {
		
	}
	
	public Tennis(IFortune fortune) {
		this.fortune = fortune;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String getDailyTask() {
		// TODO Auto-generated method stub
		return "Practice Serving Ace for 1 hrs";
	}
	
	public String getTodaysFortune() {
		//return new FortuneTellerService().getDailyFortune();
		return fortune.getDailyFortune();
	}

}
