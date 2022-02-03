package com.nutrition.intake.fileservice;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.nutrition.intake.dto.WeekResponse;

@Service
public class SpoonacularWeekIntegration {

	public ResponseEntity<WeekResponse> getWeekApi(String numCalories, String diet, String exclusions) {
		
		RestTemplate rt = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("apiKey", "437d248c9b4448beab993528edcfb1c2")
				.queryParam("targetCalories", Integer.parseInt(numCalories))
				.queryParam("timeFrame", "week")
				.queryParam("diet", diet)
				.queryParam("exclude", exclusions)
				.build()
				.toUri();

		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);

		return response;

	}
}
