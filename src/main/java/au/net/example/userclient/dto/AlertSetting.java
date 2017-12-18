package au.net.example.userclient.dto;

import java.util.Arrays;

import au.net.example.userclient.enums.Presence;

public class AlertSetting {
	private String alertDescription;
	private String[] categories;
	private Integer distanceToWip;
	private String locationFormatted;
	private float locationLatitude;
	private float locationLongitude;
	private Presence presence;
	public String getAlertDescription() {
		return alertDescription;
	}
	public void setAlertDescription(String alertDescription) {
		this.alertDescription = alertDescription;
	}
	public String[] getCategories() {
		return categories;
	}
	public void setCategories(String[] categories) {
		this.categories = categories;
	}
	public Integer getDistanceToWip() {
		return distanceToWip;
	}
	public void setDistanceToWip(Integer distanceToWip) {
		this.distanceToWip = distanceToWip;
	}
	public String getLocationFormatted() {
		return locationFormatted;
	}
	public void setLocationFormatted(String locationFormatted) {
		this.locationFormatted = locationFormatted;
	}
	public float getLocationLatitude() {
		return locationLatitude;
	}
	public void setLocationLatitude(float locationLatitude) {
		this.locationLatitude = locationLatitude;
	}
	public float getLocationLongitude() {
		return locationLongitude;
	}
	public void setLocationLongitude(float locationLongitude) {
		this.locationLongitude = locationLongitude;
	}
	public Presence getPresence() {
		return presence;
	}
	public void setPresence(Presence presence) {
		this.presence = presence;
	}
	
	public AlertSetting(String alertDescription, String[] categories, Integer distanceToWip,
			String locationFormatted, float locationLatitude, float locationLongitude, Presence presence) {		
		this.alertDescription = alertDescription;
		this.categories = categories;
		this.distanceToWip = distanceToWip;
		this.locationFormatted = locationFormatted;
		this.locationLatitude = locationLatitude;
		this.locationLongitude = locationLongitude;
		this.presence = presence;
	}
	
	public AlertSetting() {		
	}
	
	@Override
	public String toString() {
		return "AlertSetting [alertDescription=" + alertDescription + ", categories=" + Arrays.toString(categories)
				+ ", distanceToWip=" + distanceToWip + ", locationFormatted=" + locationFormatted
				+ ", locationLatitude=" + locationLatitude + ", locationLongitude=" + locationLongitude + ", presence="
				+ presence + "]";
	}
}
