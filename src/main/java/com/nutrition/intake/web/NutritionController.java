package com.nutrition.intake.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nutrition.intake.dto.DayResponse;
import com.nutrition.intake.dto.WeekResponse;
import com.nutrition.intake.fileservice.SpoonacularDayIntegration;
import com.nutrition.intake.fileservice.SpoonacularWeekIntegration;

@RestController
public class NutritionController {

	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam (required = false) String numCalories,
													 @RequestParam (required = false) String diet,
													 @RequestParam (required = false) String exclusions) {
		
		SpoonacularWeekIntegration weekResponse = new SpoonacularWeekIntegration();
		return weekResponse.getWeekApi(numCalories, diet, exclusions);
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam (required = false) String numCalories,
												   @RequestParam (required = false) String diet,
												   @RequestParam (required = false) String exclusions) {
		
		SpoonacularDayIntegration dayResponse = new SpoonacularDayIntegration();
		return dayResponse.getDayApi(numCalories, diet, exclusions);
		
	}
}
