package com.fleetmanagement;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;

@RestController
public class Locations {
	
	@RequestMapping(path="/locations/{latitude_longitude}/test", method = RequestMethod.GET)
	public @ResponseBody FleetResponse locations(@PathVariable String latitude_longitude) {

		FleetResponse fleetResponse = new FleetResponse();
		fleetResponse.setLatitudeLongitude(latitude_longitude);
		return fleetResponse;
	}

}
