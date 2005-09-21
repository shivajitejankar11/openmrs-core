package org.openmrs;

import java.util.Date;

/**
 * Location 
 * 
 * @author Ben Wolfe
 * @version 1.0
 */
public class Location implements java.io.Serializable {

	public static final long serialVersionUID = 1L;

	// Fields

	private Integer locationId;
	private String name;
	private String description;
	private String address1;
	private String address2;
	private String cityVillage;
	private String stateProvince;
	private String country;
	private String postalCode;
	private String latitude;
	private String longitude;
	private User creator;
	private Date dateCreated;

	// Constructors

	/** default constructor */
	public Location() {
	}

	/** constructor with id */
	public Location(Integer locationId) {
		this.locationId = locationId;
	}

	/** 
	 * Compares two objects for similarity
	 * 
	 * @param obj
	 * @return boolean true/false whether or not they are the same objects
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Location) {
			Location loc = (Location) obj;
			if (this.getLocationId() != null && loc.getLocationId() != null)
				return (this.getLocationId().equals(loc.getLocationId()));
			/*
			return (this.getName().equals(loc.getName()) &&
					this.getDescription().equals(loc.getDescription()) &&
					this.getAddress1().equals(loc.getAddress1()) &&
					this.getAddress2().equals(loc.getAddress2()) &&
					this.getCityVillage().equals(loc.getCityVillage()) &&
					this.getStateProvince().equals(loc.getStateProvince()) &&
					this.getPostalCode().equals(loc.getPostalCode()) &&
					this.getCountry().equals(loc.getCountry()) &&
					this.getLatitude().equals(loc.getLatitude()) &&
					this.getLongitude().equals(loc.getLongitude()));
			*/
		}
		return false;
	}
	
	public int hashCode() {
		if (this.getLocationId() == null) return super.hashCode();
		return this.getLocationId().hashCode();
	}

	// Property accessors

	/**
	 * @return Returns the address1.
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 The address1 to set.
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return Returns the address2.
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 The address2 to set.
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return Returns the cityVillage.
	 */
	public String getCityVillage() {
		return cityVillage;
	}

	/**
	 * @param cityVillage The cityVillage to set.
	 */
	public void setCityVillage(String cityVillage) {
		this.cityVillage = cityVillage;
	}

	/**
	 * @return Returns the country.
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country The country to set.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return Returns the creator.
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * @param creator The creator to set.
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * @return Returns the dateCreated.
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated The dateCreated to set.
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return Returns the latitude.
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude The latitude to set.
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return Returns the locationId.
	 */
	public Integer getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId The locationId to set.
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return Returns the longitude.
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude The longitude to set.
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the postalCode.
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode The postalCode to set.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return Returns the stateProvince.
	 */
	public String getStateProvince() {
		return stateProvince;
	}

	/**
	 * @param stateProvince The stateProvince to set.
	 */
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	
}