package com.fleetmanagement.dbo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="location")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Size(min=1, max=50)
	@Column(name = "latitude", nullable = false)
	private String latitude;
	
	@Size(min=1, max=50)
	@Column(name = "longitude", nullable = false)
	private String longitude;

	@Size(min=1, max=55)
	@Column(name = "uuid", nullable = false)
	private String uuid;
	
//	@JoinColumn(name = "country")
//    @ManyToOne(optional = false)
//	private CountryDO country;
//	
//	@JoinColumn(name = "state")
//    @ManyToOne(optional = false)
//	private StateDO stateDO;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
		
}
