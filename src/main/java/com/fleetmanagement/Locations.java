package com.fleetmanagement;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Locations {
	
	@RequestMapping(path="/locations/{latitude_longitude}/test", method = RequestMethod.GET)
	public void locations(@PathVariable String latitude_longitude) {
		System.out.println("latitude:: "+ latitude_longitude);
	}

}
