package com.fleetmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetmanagement.dao.LocationDao;
import com.fleetmanagement.data.LocationData;
import com.fleetmanagement.dbo.Location;
import com.fleetmanagement.models.LocationRequestBody;
import com.fleetmanagement.models.LocationResponse;

@Service
public class LocationService {
	
	@Autowired
	private LocationDao locationDao;

	public LocationResponse saveLocation(LocationRequestBody locationRequestBody) {
		
		LocationResponse locationResponse = new LocationResponse();
		if(!locationRequestBody.isValid()) {
			locationResponse.setError(locationRequestBody.getError());
			return locationResponse;
		}
		
		LocationData location = new LocationData();
        location.setLatitude(locationRequestBody.getLatitude());
        location.setLongitude(locationRequestBody.getLongitude());
        
        Location locationResponseFromDb = locationDao.save(location);
        
        if(locationResponseFromDb == null) {
        	locationResponse.setError("SOMETHINGWENT WRONG! NOTHING WAS SAVED.");
        	return locationResponse;
        }
        
        locationResponse.setLatitude(locationResponseFromDb.getLatitude());
        locationResponse.setLongitude(locationResponseFromDb.getLongitude());
        locationResponse.setUuid(locationResponseFromDb.getUuid());
        
        return locationResponse;
        
	}


}
