package au.net.example.userclient.dto;

import au.net.example.userclient.enums.NotificationMeansType;

public class NotificationConfig {
	private NotificationMeansType notificationMeansType;
	private Integer frequencyMinutes;
	private boolean notificationMeansTypeActive;
	
	public Integer getFrequencyMinutes() {
		return frequencyMinutes;
	}
	public void setFrequencyMinutes(Integer frequencyMinutes) {
		this.frequencyMinutes = frequencyMinutes;
	}
	public boolean isNotificationMeansTypeActive() {
		return notificationMeansTypeActive;
	}
	public void setNotificationMeansTypeActive(boolean notificationMeansTypeActive) {
		this.notificationMeansTypeActive = notificationMeansTypeActive;
	}
	public NotificationMeansType getNotificationMeansType() {
		return notificationMeansType;
	}
	public void setNotificationMeansType(NotificationMeansType notificationMeansType) {
		this.notificationMeansType = notificationMeansType;
	}
	
	public NotificationConfig(NotificationMeansType notificationMeansType, Integer frequencyMinutes,
			boolean notificationMeansTypeActive) {		
		this.notificationMeansType = notificationMeansType;
		this.frequencyMinutes = frequencyMinutes;
		this.notificationMeansTypeActive = notificationMeansTypeActive;
	}
	public NotificationConfig() {		
	}
	
	@Override
	public String toString() {
		return "NotificationConfig [notificationMeansType=" + notificationMeansType + ", frequencyMinutes="
				+ frequencyMinutes + ", notificationMeansTypeActive=" + notificationMeansTypeActive + "]";
	}
}
