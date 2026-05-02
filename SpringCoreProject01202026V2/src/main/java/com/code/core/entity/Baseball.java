package com.code.core.entity;

public class Baseball implements ICoach {
	private String name;
	private String emailId;
	private IFortune fortune;
	
	public Baseball() {
		
	}
	
	public Baseball(IFortune fortune) {
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
		return "Practice running for 1 hr";
	}
	
	public String getTodaysFortune() {
		return fortune.getDailyFortune();
	}

}
