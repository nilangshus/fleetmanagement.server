package com.fleetmanagement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Locations {
	
	private static final String LOCATIONS = "locations.txt";
	
	@RequestMapping(path="/locations/{latitude_longitude}/test", method = RequestMethod.GET)
	public @ResponseBody FleetResponse locations(@PathVariable String latitude_longitude) throws IOException {

		FileWriter fw = new FileWriter(LOCATIONS,true);
		fw.write(latitude_longitude+"\n\r");
		fw.close();
			
		FleetResponse fleetResponse = new FleetResponse();
		fleetResponse.setLatitudeLongitude(latitude_longitude);
		return fleetResponse;
	}

}
