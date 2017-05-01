package com.fleetmanagement.models;

import com.google.gson.JsonObject;

public class LocationResponse {
	
	private String latitude;
	private String longitude;
	private String uuid;
	private String error;
	private JsonObject jsonResponse;
	
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
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	public JsonObject toJsonObject() {
		jsonResponse.addProperty("latitude", latitude);
		jsonResponse.addProperty("longitude", longitude);
		jsonResponse.addProperty("uuid", uuid);
		jsonResponse.addProperty("error", error);
		return jsonResponse;
	}

}
