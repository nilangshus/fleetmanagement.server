package com.fleetmanagement.models;

import com.fleetmanagement.interfaces.BaseRequestBody;

public class LocationRequestBody implements BaseRequestBody {
	
	private String latitude;
	private String longitude;
	private String error;
	
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	@Override
	public boolean isValid() {
		
		if(latitude == null || latitude.isEmpty()) {
			error = "latitude is required in request body";
			return false;
		}
		if(longitude == null || longitude.isEmpty()) {
			error = "longitude is required in request body";
			return false;
		}
		return true;
	}

}
