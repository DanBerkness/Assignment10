package com.nutrition.intake.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Week {

	@JsonProperty("monday")
	private Monday monday;
	
	@JsonProperty("tuesday")
	private Tuesday tuesday;
	
	@JsonProperty("wednesday")
	private Wednesday wednesday;
	
	@JsonProperty("thursday")
	private Thursday thursday;
	
	@JsonProperty("friday")
	private Friday friday;
	
	@JsonProperty("saturday")
	private Saturday saturday;
	
	@JsonProperty("sunday")
	private Sunday sunday;
	
	
	public Monday getMonday() {
		return monday;
	}

	public void setMonday(Monday monday) {
		this.monday = monday;
	}

	public Tuesday getTuesday() {
		return tuesday;
	}

	public void setTuesday(Tuesday tuesday) {
		this.tuesday = tuesday;
	}

	public Wednesday getWednesday() {
		return wednesday;
	}

	public void setWednesday(Wednesday wednesday) {
		this.wednesday = wednesday;
	}
	
	public Thursday getThursday() {
		return thursday;
	}

	public void setThursday(Thursday thursday) {
		this.thursday = thursday;
	}

	public Friday getFriday() {
		return friday;
	}

	public void setFriday(Friday friday) {
		this.friday = friday;
	}

	public Saturday getSaturday() {
		return saturday;
	}

	public void setSaturday(Saturday saturday) {
		this.saturday = saturday;
	}

	public Sunday getSunday() {
		return sunday;
	}

	public void setSunday(Sunday sunday) {
		this.sunday = sunday;
	}

}
