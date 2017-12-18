package au.net.example.userclient.dto;

public class AccountNotification {
	
	private Integer accountNotificationId;
	private String notificationDescription;
	private NotificationConfig smsNotification;
	private NotificationConfig emailNotification;
	
	public Integer getAccountNotificationId() {
		return accountNotificationId;
	}
	public void setAccountNotificationId(Integer accountNotificationId) {
		this.accountNotificationId = accountNotificationId;
	}
	public String getNotificationDescription() {
		return notificationDescription;
	}
	public void setNotificationDescription(String notificationDescription) {
		this.notificationDescription = notificationDescription;
	}
	public NotificationConfig getSmsNotification() {
		return smsNotification;
	}
	public void setSmsNotification(NotificationConfig smsNotification) {
		this.smsNotification = smsNotification;
	}
	public NotificationConfig getEmailNotification() {
		return emailNotification;
	}
	public void setEmailNotification(NotificationConfig emailNotification) {
		this.emailNotification = emailNotification;
	}
	
	public AccountNotification(Integer accountNotificationId, String notificationDescription,
			NotificationConfig smsNotification, NotificationConfig emailNotification) {
		super();
		this.accountNotificationId = accountNotificationId;
		this.notificationDescription = notificationDescription;
		this.smsNotification = smsNotification;
		this.emailNotification = emailNotification;
	}
	
	public AccountNotification() {
	}
	
	@Override
	public String toString() {
		return "AccountNotification [accountNotificationId=" + accountNotificationId + ", notificationDescription="
				+ notificationDescription + ", smsNotification=" + smsNotification + ", emailNotification="
				+ emailNotification + "]";
	}	
}
