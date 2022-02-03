package com.nutrition.intake.fileservice;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


import com.nutrition.intake.dto.Week;

@Service
public class WeekResponse {

	public ResponseEntity<Week> getWeekApi () {
		RestTemplate rt = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("apiKey", "437d248c9b4448beab993528edcfb1c2")
									  .queryParam("targetCalories", 2000)
									  .queryParam("timeFrame", "week")
									  .queryParam("diet", "vegan")
									  .queryParam("exclude", "shellfish")
									  .build()
									  .toUri();
		
		ResponseEntity<Week> response = rt.getForEntity(uri, Week.class);
		System.out.println(response.getBody());
	return response;
		
	}
}
