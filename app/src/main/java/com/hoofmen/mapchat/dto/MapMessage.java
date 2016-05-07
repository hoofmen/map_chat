package com.hoofmen.mapchat.dto;

public class MapMessage {
	private long lon;
	private long lat;
	private String message;
	private int duration;
	
	/**
	 * @return the lon
	 */
	public long getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(long lon) {
		this.lon = lon;
	}
	/**
	 * @return the lat
	 */
	public long getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(long lat) {
		this.lat = lat;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
