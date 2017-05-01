package com.fleetmanagement.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fleetmanagement.dbo.Location;
import com.fleetmanagement.models.LocationRequestBody;
import com.fleetmanagement.models.LocationResponse;
import com.fleetmanagement.service.LocationService;

@RestController
public class Locations {
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping(path="/locations", method = RequestMethod.POST, 
				consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody LocationResponse locations(@RequestBody LocationRequestBody locationRequestBody) throws IOException {

		return locationService.saveLocation(locationRequestBody);
		
	}

}
