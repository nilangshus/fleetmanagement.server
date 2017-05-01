package com.fleetmanagement.dao;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.apache.logging.log4j.core.util.UuidUtil;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.springframework.stereotype.Repository;

import com.fleetmanagement.data.LocationData;
import com.fleetmanagement.dbo.Location;

@Repository("locationdao")
@Transactional
public class LocationDao extends BaseDao{

	public Location getLocationbyID(int id){
		Location location=(Location) getSession().get(Location.class, id);
		return location;
	}
	
	public List<Location> findAllLocations(){
		Criteria criteria = getSession().createCriteria(Location.class);
		return criteria.list();
	}
	
	public Location save(LocationData locationData) {

		Transaction transaction = getSession().beginTransaction();
		
		Location location = new Location();
		location.setLatitude(locationData.getLatitude());
		location.setLongitude(locationData.getLongitude());
		location.setUuid(UuidUtil.getTimeBasedUuid().toString());
		
		getSession().save(location);
		if (!transaction.getStatus().equals(TransactionStatus.ACTIVE)) {
			transaction.commit();
		}
		
		return location;
		
	}
	
}
