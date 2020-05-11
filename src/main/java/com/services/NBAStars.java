package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NBAStars implements IServiceCall {

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public String getNbaStars()
	{
		ResponseEntity<String> response = null;
		
		response = restTemplate.getForEntity("https://stats.nba.com/stats/allstarballotpredictor", String.class);
		
		return response.getBody();
	}
	
}
