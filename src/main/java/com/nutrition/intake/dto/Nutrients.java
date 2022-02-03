package com.nutrition.intake.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {

	@JsonProperty("calories")
	private Double calories;
	
	@JsonProperty("protein")
	private Double protien;
	
	
	@JsonProperty("fat")
	private Double fat;
	
	@JsonProperty("carbohydrates")
	private Double carbohydrates;
	

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public Double getProtien() {
		return protien;
	}

	public void setProtien(Double protien) {
		this.protien = protien;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	
	
}
