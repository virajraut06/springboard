package com.xoriant.newpack;

public class PoliceCommissioner {
	private int NoOfPoliceReporting, MedalHolds, NoOfPostings;
	private String WorkPlace = new String();
	public PoliceCommissioner() {
		this.NoOfPoliceReporting = 30;
		this.WorkPlace = "Mumbai";
		this.MedalHolds = 5;
		this.NoOfPostings = 4;
	}
	public PoliceCommissioner(int NoOfPoliceReporting, String WorkPlace, int MedalHolds, int NoOfPostings) {
		this.NoOfPoliceReporting = NoOfPoliceReporting;
		this.WorkPlace = WorkPlace;
		this.MedalHolds = MedalHolds;
		this.NoOfPostings = NoOfPostings;
	}
	public int getNoOfPoliceReporting() {
		return NoOfPoliceReporting;
	}
	public int getMedalHolds() {
		return MedalHolds;
	}
	public int getNoOfPostings() {
		return NoOfPostings;
	}
	public String getWorkPlace() {
		return WorkPlace;
	}
	
	
}
