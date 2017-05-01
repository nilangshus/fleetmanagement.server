package com.fleetmanagement.interfaces;

public abstract class BaseService <T> {
	
	public abstract <T> T saveLocation(BaseRequestBody requestBody);

}
