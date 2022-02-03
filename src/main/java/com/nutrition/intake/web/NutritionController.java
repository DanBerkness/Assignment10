package com.nutrition.intake.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nutrition.intake.dto.Week;
import com.nutrition.intake.fileservice.DayResponse;
import com.nutrition.intake.fileservice.WeekResponse;

@RestController
public class NutritionController {

	@GetMapping("mealplanner/week")
	public ResponseEntity<Week> getWeekMeals(String numCalories, String diet, String exclusions) {
		WeekResponse weekResponse = new WeekResponse();
		return weekResponse.getWeekApi();
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
		return null;
		
	}
}
